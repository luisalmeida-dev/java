# Estruturas de dados em java
* Estrutura de dados são **diferentes formas de armazenar dados em memória**.

### Estruturas do tipo *Primitivo*
* São os tipos de dados primitivos. Inte, char, float, double e ponteiro são eles, que conseguem segurar somente um valor.

### Estruturas do tipo *Não primitivo*
* Linear:
  * São os que o dado é organizado de forma sequencial, um elemento é conectado a somente um outro elemento de forma linear.
  * **Vetores, Listas ligadas, Pilhas e Filas são estruturas desse tipo**.
    
* Não Linear:
  * Quando um elemento pode ser conectado ao *n* elemento, eles acabam sendo arranjados de forma aleatoria.
  * **Arvores e Grafos são estruturas não lineares**.

## Principais operções:
* As operações comuns entre as estruturas são: 
  * *Busca:* Procurar por um elemento.
  * *Ordenar:* Pode organizar os elementos de forma crescente ou descendente.
  * *Inserir:* Inserir um novo elemento na estrutura.
  * *Atualizar:* Podemos substituir um elemento com outro.
  * *Deletar:* Remover um elemento da estrutura.

## Qual estrutura de dados escolher?:
* Utilizamos estruturas para resolver tipos de dados abstratos **(ADT)**, basicamente as ADTs como uma pilha implementam estruturas
como *vetores* ou *listas ligadas*, então ADT mostram *o que* tem que ser feito e as estruturas mostram *como* vai ser feito.
* Já que podemos escolher várias estruturas de dados para resolver um problema, as necessidades de cada uso serão consideradas para determinar a melhor opção.

## Vantagens das estruturas de dados:
* *Eficiência:* Se a esolhar de uma estrutura para resolver uma DAT for correta, vai fazer o programa ser eficiênte no aspecto tempo e espaço.
* *Reutilização:* Estruturas podem ser utilizadas por varios programas.
* *Abstração:* Ao utilizar uma ADT o usuário não visualiza o processo interno da estrtutura de dados.

## O que é estrutura de dados:
* São diferentes forma de armazenar e organizar dados na memória do computador para facilitar o acesso e utilização desses dados.
* O estudo das estruturas possibilita o entendimento da organização dos dados e do gerenciamento de fluxo deles de forma a aumentar a eficiência
  de qualquer processo ou programa.

## Classificação das estruturas de dados:
* Podem ser classificadas de duas formas, **primitivas** e **não primitivas**.
* Primitivas:
  * São as estruturas que consistem de numeros e caracteres que vem embutidos nos programas
  * Podem ser manipuladas ou operadas diretamente de instruções a nivel de maquina.
  * Tipos basicos de dados como *Integer, Float, Character e Boolean* são tipos primitivos de estruturas de dados.
  * Também são chamdas de *Tipo dado simples*, já que tem caracteres que não podem ser divididos posteriormente.
* Não primitivos:
  * São estruturas derivadas das *estruturas de dados primitivas*
  * Não podem ser manipuladas ou operadas diretamente por instruções a nivel de maquina
  * Tem o foco de formar um conjunto de elementos de dados que seja homogeneo (mesmo tipo) ou heterogeneo (tipos diferentes)
  * Baseado na estrutura ou organização dos dados podemos dividir as estruturas em duas sub-categorias: Lineares e não lineares

### Estruturas de dados Lineares:
* Estrutura onde o arranjo dos dados é feito de forma linear, onde cada elemento consiste do sucessor e antecessor, exceto o primeiro e
  ultimo elemento
* Essas estruturas podem ser dividadas entre *estaticas* e *dinamicas*
  * *Estáticas* são as que tem o tamanho fixo, a memória dessas estrturas são alocadas em tempo de compilação, então seu tamanho não
    pode ser alterado pelo usuário após ser compilada; porém, os dados armazenados nela podem ser alterados.
  * *Dinamicas* são as que tem um tamanho que pode variar, a memória é *alocada em tempo de execução* e o tamanho varia durante esse período,
    além disso o usuário pode alterar tanto o tamanho quanto os elementos armazenados na estrutura no periodo de execução do código.