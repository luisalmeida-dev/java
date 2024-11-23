# Lambda expressions
 - É um curto bloco de códgio quer recebe parametros e retorna um valor.
 - São similirares a metodos, mas *não precisam de nome e pode ser implementados dentro do corpo de um metodo*
```java
    parametros -> expressao
        (paremetro1, parmetro2) -> expressao
```
 - São limitadas, *precisam retornar um valor imediatamente e não podem conter variáveis, atribuições ou instruções como if ou for*
 - Para fazer operações mais complexas precisamos abrir um bloco de códgio com chaves
 - Se a função retorna um valor o bloco criado tem que ter uma instrução return
```java
parametro ->{
    bloco de
    codigo
    }
```