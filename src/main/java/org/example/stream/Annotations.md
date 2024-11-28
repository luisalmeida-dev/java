# Streams

- É uma biblioteca do java que consiste de *classes, interfaces e enums para permitir operações no estilo funcional*.
- Tem os seguintes recursos:
    - Não armazena elementos. Simplesmente *transporta elementos de uma fonte como estruturas de dados, um array ou um
      canal
      de I/O por um pipeline de operações computacionais.*
    - Tem naturazena funcional. Operações em *uma stream não modifica a fonte dos elementos*. Por exemplo filtra uma
      stream
      de uma coleção *gera outra stream* sem os elementos filtrados ao invés de remover eles da coleção fonte.
    - É lazy, então só executa código quando é requisitada.
    - Os elementos de uma stream são visitados somente uma vez durante seu ciclo de veida. É preciso fazer outra stream
      para
      acessar o mesmo elemento da fonte novamente.
- Podemos utiliza stream para *filtrar, coletar, printar, e converter de uma estrutura de dados para outra.*

## Operações essenciais:

### Operações intermediarias:

- São as operações que *retornam outra stream*. Geralmente são utilizadas para transformar ou filtra elementos da stream
  original.
- Como são lazy *não performam nenhum processamento até uma operação terminal ser chamada.*
- *Multiplas operações intermediarias podem ser encadeadas.*
```java
eg: map(), filter(), flatMap(), distinct(), sorted();
```

### Operações terminais:

- São as *operações que consomem a stream e produzem um resultado*, como um valor, coleção ou até memesmo um efeito
  colateral.
- Uma vez que uma operação terminal é chamada a *stream é processada e não pode ser reutilizada*.

```java
eg: forEach(), collect(), reduce(), count();
```
### Operações curto circuito:
- São operações que não precisa percorrer a totalidade da stream.
- Podem produzir uma saida precoce do pipeline, possivelmente salvado tempo computacional.

```java
eg: anyMatch(), allMatch(), findFirst(), findAny();
```