# Threads
 - Permite que diferentes códigos ou partes dele sejam *executados simultaneamente*
 - Ajuna na utilização eficiente de recursos e melhora resposta da aplicação.
 - Pode ser feita pela *instanciação da classe Thread* ou *implementando a interface Runnable*
   - Thread tem suporte para multithreading enquanto Runnable tem um unico metodo *Run()* que permite criar uma thread
        separada com o código que quisermos.

## Classe Thread:
 - É a forma mais simples de criar uma thread, basta *extender a classe Thread e sobrescrever o metodo Run()*
 - Disponibiliza construtores e metodos para lidar com uma thread

## Interface Runnable:
 - Pode ser implementada por qualquer classe que tenha o intuito de ser realizada por uma thread separada a original do programa
 - É preferivel quando queremos separa a função da thread em si