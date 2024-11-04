# Funções

1. É uma bloco de código que tem o intuito de realizar uma tarefa, usado para alcançar reusabilidade de código. Também ajuda com a facilidade de modificação e leitura do código.

## Declaração
* Onde ficam as informações sobre o metodo, como visibilidade, tipo de retorno, nome e os parametros.
  * É composto por 6 componentes que são chamados de cabeçalho do metodo.

  ```java
  public int sum (int a, int b) {
  // corpo do metodo
  }
  ```  

**PUBLIC:** Chamado de *Especificador/Modificador de acesso* especifica o tipo de visibilidade do metodo. Existem 4 tipos no java.
  * **Public:** O metodo fica acessível por todas as classes
  * **Private:** Fica acessível somente na classe onde foi declarado.
  * **Protected:** Fica acessível somente dentro do mesmo pacote do metodo ou subclasses em diferente pacotes.
  * **Default** Quando não fazemos a declaração o java coloca o default, o metodo fica visível somente no mesmo pacote.
   
**INT:** Chamado de *tipo de retorno* é o tipo de dado que o metodo retorna, podendo ser um tipo primitivo, objeto, coleção, void entre outros.
            Quando não retornamos nada o tipo void é dado ao metodo.

**SUM:** Esse é o *nome do metodo* é um nome unico utilizado para definir a função. Deve corresponder a funcionalidade do metodo.

**(INT A, INT B):** É a lista de *parametros* separados por virgula e envolvidos por parenteses, contemo tipo de dado e nome da variável.
Se o metodo não tiver parametro o parentese fica vazio.

## Nomenclatura
* O nome do metodo tem que ser um verbo e seguir o carametro **_camelCase_**, onde começa com letra minuscula e caso tenha mais de uma palavra
   elas vao começar com letra maiuscula 
* Pode acontecer de existir dois metodos com o mesmo nome na mesma classe, isso se chama **_sobrecarga de metodo/method overload_**

## Tipos de metodos
* Existem dois tipos de metodos

**METODO PREDEFINIDO:** São metodos já definidos nas classes das bibliotecas do Java, conhecidos como **_metodos padrões da biblioteca ou metodos embutidos_**.
Podem ser utilizado em qualquer ponto do código simplesmente chamando o nome deles. **length(), equals(), compareTo()** são exemplos de código predefinido.
Todos os metodos são definidos dentro de uma classe que pertence as bibliotecas.
```Java
    System.out.print("Maior numero: " + Math.max(9,7))
```
* Nesse pedaço de código foram utilizados os metodos embutidos **_print() e max()_**

**METODO DEFINIDO PELO USUÁRIO:** São metodos que tem seu comportamento desenvolvido pelo usuário, sua funcionalidade é definida de acordo com a necessidade do dev.
```Java
    public static void imparOuPar(int num){
        if(num%2==0){
            System.out.print(num + " é par");
        } else {
            System.out.print(num + " é impar");
        }
    }   
```
* O metodo acima foi declarado para valida se um numero é impar ou par.

```Java
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Insira o numero: ");
        int num = scan.nextInt();
        //chamando o metodo criado abaixo
        imparOuPar(num);
    }
```
* Vemos acima o metodo imaprOuPar sendo chamado, no momento em que ele é invocado o controle é tranferido para a parte onde o metodo está declarado
    retornando após ele ser executado.

## Metodo estático
* É um metodo padrão que pertence a classe e não as instâncias ou seja, é possivel chamar esse metodo dentro da classe sem ter que isntanciar ela
    e quando a classe for instânciada esse metodo vai estar disponível sem precisar fazer uma copia para cada instância.

## Metodo de instância
* Metodo que não contem a palavra-chave **_static_** fazendo com que para que possa ser invocado uma instância(objeto) da classe deve ser criada

## Metodo abstrato
* Esse metodo basicamente define o contrato que as classes filhas tem que seguir, basicamente ele fala os metodos que as subclasses tem que ter, mas sem ditar
    como devem ser implementados, assim cada subclasse pode ter uma funcionalidade diferente para o metodo.