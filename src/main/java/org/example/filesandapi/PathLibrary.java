package org.example.filesandapi;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.util.Comparator;
import java.util.stream.Stream;

public class PathLibrary {
    public static void main(String[] args) {
        /*
        - Construindo o objeto com o arquivo que precisamos
        - Antes do java 11 Path.of era Paths.get
        - O caminha tem que ser validado manualmente, não há garantia de que o arquivo realmente exista
        */
        Path path = Path.of("C:/Users/anjos/Downloads/teste.txt");

        /*
        Operacoes comuns com arquivos
        */

        /*
        - Verificar se arquivo existes(esta usando a biblioteca Files)
        - Podemos expecificar parametros adicionais, como a forma que symlinks serao manipulados.
        */
        boolean exists = Files.exists(path);
        System.out.println("Does the file exists: " + exists);

        /*
        - Pegar a data da ultima modificacao do arquivo(Retornar um objeto FileTime)
        */
        try {
            FileTime lastModifiedTime = Files.getLastModifiedTime(path);
            System.out.println("Last modification was: " + lastModifiedTime);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Comparar arquivos
        - Foi adicionado a partir do java 12
        - Rertorna a posição do primeiro byte que não é igual ou -1L quando são iguais.
        */
        try {
            long mismatchIndex = Files.mismatch(path, Path.of("C:/Users/anjos/Downloads/teste2.txt"));
            System.out.println("There is a mismatch between files: " + mismatchIndex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Pegar o dono do arquivo
        - No caso do Windwos utiliza o WindowsUserPrincipal
        - Retorna o nome da conta do usuario jundo de seu SID
        */

        try {
            UserPrincipal owner = Files.getOwner(path);
            System.out.println("File owner is: " + owner);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Criar arquivos temporarios.
        - Ao criar podemos especificar um prefixo e sulfixo (Podem ser nulos)
        - O prefixo vai ser o nome do arquivo e o sufixo sera sua extensao (extensao padrao é ".tmp")
        - O arquivo é criado no diretório default temporary-file (Podemos especificar o diretorio na hora de criar o arquivo)
        */

        try {
            Path tempFile1 = Files.createTempFile("file name", ".jpg");
            System.out.println("Temp file 1: " + tempFile1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Path tempFile2 = Files.createTempFile(path.getParent(), "file name", ".jpg");
            System.out.println("Temp file 2: " + tempFile2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Criar diretorio temporario
        - Eles não se excluem automaticament, então tem que ser feito manualmente apos utilza-los em teste ou produção.
        */

        try {
            Path tempDirectory = Files.createTempDirectory("prefix");
            System.out.println("Temp Directory: " + tempDirectory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Criar arquivos e diretorios (Funciona da mesma forma dos temporarios)
        - O metodo .resolve apenas retorna um caminho para referenciar o arquivo filho que esta sendo criado.
        */

        try {
            Path newDirectory = Files.createDirectory(path.getParent().resolve("newDirectory"));
            System.out.println("New directory: " + newDirectory);

            Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
            System.out.println("New file: " + newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Lendo e escrevendo arquivos
        - Ao escrever o padrão de encode é o UTF-8, mas pode ser alterado.
        */

        try {
            Path utfFile = Files.createTempFile("some", ".txt");
            Files.writeString(utfFile, "this is my string àà ù ú ú");
            System.out.println("utfFile: " + utfFile);

            Path iso88591File = Files.createTempFile("some2", ".txt");
            Files.writeString(iso88591File, "this is my new string àà ù ú ú", StandardCharsets.ISO_8859_1);
            System.out.println("iso88591File :" + iso88591File);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Ler strings de um arquivo
        */
        Path readFile = Path.of("C:\\Users\\anjos\\Downloads\\teste.txt");
        try {
            String s = Files.readString(readFile);
            System.out.println("String is: " + s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Ler bytes de um arquivo
        */
        try {
            String string = new String(Files.readAllBytes(readFile), StandardCharsets.UTF_8);
            System.out.println("String bytes :" + string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Mover e Deletar arquivos
        - Temos que colocar o novo caminho inteiro no metodo Files.move, incluindo o nome do arquivo e extensão
        - Podemos escolher o que vai ser feito ao mover como: substituir existente, copiar atributos etc.
        - Api Path consegue deletar arquivos e diretórios, porém os diretórios deve estar vazios.
        - Temos que tuilizar o Files.walk com um comparador para deletar repositorios nao vazios.
        */
        try {
            Files.move(readFile, Path.of("C:\\Users\\anjos\\Downloads").resolve(readFile.getFileName().toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.delete(Path.of("C:\\Users\\anjos\\Downloads\\file name17206987300175834269.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            Stream<Path> walk = Files.walk(Path.of("C:\\Users\\anjos\\AppData\\Local\\Temp\\prefix5475098825159800522"));
            walk.sorted(Comparator.reverseOrder()).forEach(path1 -> {
                try {
                    Files.delete(path);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        - Listar arquivos
        - Podemos listar somente no nivel do diretorio ou podemos aprofundar utilizando recusao
        */
        try {
            Path newPath = Path.of("C:/Users/anjos");
            Stream<Path> listOfFiles = Files.list(newPath);
            listOfFiles.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            Path newPath = Path.of("C:/Users/anjos");
            Stream<Path> listOfFiles = Files.walk(newPath);
            listOfFiles.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}