# Orientaçaõ a Objeto
 É a representação dos objetos do mundo real na programação.

## Classes e objetos
 - A **Classe** é uma planta de que *representa um objeto no mundo real.*
 - O **Objeto** é uma instancia de uma classe

Tudo que existe no mundo pode ser classificado como objeto(Entidade/Classe) *basta ter atributos ou ações*

## Herança
 - Basicamente quando uma crasse é criada utilizando outra de base, *a classe criada vira **classe filha ou subclasse** e a classe onde
    a subclasse foi derivada é chamada de **classe pai ou superclasse***.

## Encapsulamento
 - É o ato de realizar a contrução de atributos e metodos relacionados em uma unica classe. Também pode ajudar a realizar o _**DATA HIDING**_
 - Uma das bases para realizar *Data Hiding* no java é utilizar o tipo de acesso *Private*.
 - Temos que falar para o programa como queremos que o acesso a essas classe encapsulada seja feito, para isso em java
    podemos utilizar os getters, setters e contrutores.

## Abstração
 - Conciste em mostrar somente os atributos necessários e deixar escondido aqueles que são irrelevantes no momento.
 - Existem dois tipos de abstração, sendo eles o de *classe* e o de *metodo*.
   - Na de classe não podemos instancia-la, somente criar uma subclasse baseada nela.
   ```java
    abstract class Car{
        abstract void accelerate();
   }
   //É de responsabilidade da subclasse fazer uma implementação concreta dos metodos.
   ```
   - No de metodo ele não vai ter uma implementação, simplesmente vamos declara o metodo vazio.
   ```java
    abstract void  moveTo(double x, double y); 
   ```

## Polimorfismo
 - É o conceito de realizar uma ação em diferentes formas. Basicamente podem haver metodos que realizam a mesma ação porém 
   recebendo diferentes tipos de dados, assim escolhendo qual dos metodos vai ser chamado.
 - Existe o polimorfismo em tempo de compilação e em tempo de execução.
 - Na pasta de abstração tem exemplos de polimorfismo.
   
## Interface
 - Basicamente são contratos para padronizar a implementação de algo, assim independente de onde ou que fizer o codigo estarão padronizados.
 - Não conseguimos criar metodos concretos dentro de uma interface.
 - Em java é um tipo de referencia, parecido com uma classe. Não podem ser instânciadas, somente implementadas por 
  classes ou extendidas por outras interfaces.

## Associação
 - Define uma comunicação entre duas classes, representa um relacionamente de _**tem um**_ com outra classe. Por exemplo, uma
   tem um carro.
 - Essa associação pode ser de um ou mais objetos (podendos ser listas, maps entre outros).
