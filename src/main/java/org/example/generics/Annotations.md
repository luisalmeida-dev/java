# Generics
 - O generic serve para utilizar o mesmo metodo ou classe para diversos tipos de dados diferentes.
 - Não sacrifica a segurança de tipagem devido a validação em tempo de compilação.

## Metodos genéricos:
 - Recebe varios tipos de dados e o compilador manipula cada chamada do metodo de acordo com o tipo.
 - Os metodos genericos são declarados com o parametro de tipo envolvido em *<>* antes do tipo de retorno.
 - Só consegue ser utilizado com *tipos não primitivos*
```java
public static < E > void printArray( E[] inputArray );
```

## Classe genérica:
 - É declarada normalmente, com o difernecial de <T> após o nome da classe
```java
public class Box<T>{}
```