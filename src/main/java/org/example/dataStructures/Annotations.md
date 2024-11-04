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

### Exemplos de ADT(Abstração) e DS(Implementação)
  | Abstração(ADT) |              Implementação(DS)              |
  |:--------------:|:-------------------------------------------:|
  |     Lista      |          Dynamic Array/Linked List          |
  |      Fila      | Linked list, Array e Stack baseados em fila |
  |      Map       |       Tree Map, Hash Map e Hash table       |

### Complexidade computacional
* Utilizada para entender a performance do código/estrutura de dados.
* *Big-O Notation* fornece um limite superior da complexidade no *pior caso*, ajudando a quantificar a performance quando o input passa a
  ser arbitrariamente grande.
  
  |      Nome       | Representação |
  |:---------------:|:-------------:|
  | Tempo Constante |     O(1)      |
  |   Logaritmico   |   O(log(n))   |
  |     Linear      |     O(n)      |
  |  Linearitmico   |  O(nLog(n))   |
  |   Quadratico    |     O(n²)     |
  |     Cubico      |     O(n³)     |
  |   Exponencial   |  O(b^n), b>1  |
  |    Fatorial     |     O(!n)     |

#### Propriedades da *Big-O Notation*
* Adição e multiplicação de constante a **n** resulta em **O(n)**
  * O(n+c) ou O(cn) = o(n)

#### Exemplos comuns de Big-O
* Achar todos os subsets de um set - O(2^n)
* Achar todas as permutações de uma string - O(n!)
* Ordenar utilizando MergeSort - O(nLog(n))
* Iterar por todas as celulas de uma matriz de tamanho n por m - O(nm)

### Estruturas de dados Lineares:
* Estrutura onde o arranjo dos dados é feito de forma linear, onde cada elemento consiste do sucessor e antecessor, exceto o primeiro e
  ultimo elemento
* Essas estruturas podem ser dividadas entre *estaticas* e *dinamicas*
  * *Estáticas* são as que tem o tamanho fixo, a memória dessas estrturas são alocadas em tempo de compilação, então seu tamanho não
    pode ser alterado pelo usuário após ser compilada; porém, os dados armazenados nela podem ser alterados.
  * *Dinamicas* são as que tem um tamanho que pode variar, a memória é *alocada em tempo de execução* e o tamanho varia durante esse período,
    além disso o usuário pode alterar tanto o tamanho quanto os elementos armazenados na estrutura no periodo de execução do código.

### Tipos de estruturas lineares:
#### Array:
  * Utilizado para armazenar varios elementos do mesmo tipo em uma unica variável. Não significa que temos que unir todos os
  valores do mesmo tipo, mas que em certas ocasiões variaveis do mesmo tipo serão relacionados entre si de forma apropriadas a estrem em um *Array*
  * Cada elemento do array tem um lugar unico na lista, compartilham do mesmo nome de variável, porém, cada um tem um id uníco.
  * Podemos acessar qualquer elemento do array com a ajuda da sua localização na lista, por isso, a principal caracteristica do array
  é que os dados tem local de armazenamento lado a lado na memória, tornando possível o usuários percorrer os dados do vetor utilizando o ID.
#### Classificação dos *Arryas*:
  * Vetor unidimensional: Vetor com somente uma linha de elementos. Armazenado em local de armazenamento ascendente.
  * Vetor bidimensional: Vetor formado por mutiplas linhas e colunas de elementos. Também conhecidos como *matriz*
  * Vetor multidimensional: São *Arrays de Arrays*. Não são limitados a dois índices ou duas dimensões, pois podem incluir quantos índices
  forem necessários.
#### Complexidades do Arrya:
  | Tipo de Array |   Acesso   |  Busca   | Inserir | Anexar | Deletar | 
  |:-------------:|:----------:|:--------:|:-------:|:------:|:-------:|
  |   Estatico    |    O(1)    |   O(n)   |   N/A   |  N/A   |   N/A   |
  |   Dinamico    |    O(1)    |   O(n)   |  O(n)   |  O(1)  |  O(n)   |

#### Listas ligadas:
  * Utilizada para armazenar dados dinamicamente. Os elementos de dados são representados por *nós conectados utilizando ponteiros ou links*.
  * Cada nó tem dois campos, o de informação tem o dado em si, já o ponteiro tem o enderesso do nó subsequente.
  * O ponteiro do ultimo nó tem o valor *null*, já que não aponta para nada.
  * O usuário consegue ajustar dinamicamente o tamanho da lista ligada de acordo com os requisitos.

#### Lista ligada vc duplamente ligada:
  * *Lista ligada* tem somente a referencia para o proximo nó. Na implementação ela sempre mantem uma referencia para a *cabeça* (inicio)
  da lista e para a *cauda* (final da lista), para rapidas adições/remoções na lista.
  *  *Lista duplamente ligada* tem tanto referência para o próximo nó quanto para o anterior. Na implementação ela sempre mantem uma 
  referencia para a *cabeça* (inicio) da lista e para a *cauda* (final da lista), para rapidas adições/remoções nas duas pontas da lista.

#### Vantagens e desvantages:
  * **Vantagens:**
    * Lista ligada: Usa menos memória | Implementação mais simples
    * Lista duplamente ligada: Pode ser atravessada de tras para frente.
  * **Desvantagens:**
    * Lista ligada: Não consegue acessar de forma facil os elementos anteriores.
    * Lista duplamente ligada: Utiliza 2x mais memória.

#### Complexidade das listas ligadas:
  |   Tipo de Lista   | Busca | Inserir no começo | Inserir no final | Remover no começo | Remover no final | Remover no meio | 
  |:-----------------:|:-----:|:-----------------:|:----------------:|:-----------------:|:----------------:|:---------------:|
  |      Ligada       | O(n)  |       O(1)        |       O(1)       |       O(1)        |       O(n)       |      O(n)       |
  | Duplamente ligada | O(n)  |       O(1)        |       O(1)       |       O(1)        |       O(1)       |      O(n)       |

#### Pilha (Stack):
  * É uma estrutura de dados linear com somente uma entrada/saida que segue o funcionamento de uma pilha/monte, como se fosse um copo.
  * Tem duas operções primárias, *push* e *pop*.
  * Só temos acesso ao item no topo da stack, então internamente ela tem uma variável que fica com o valor do topo atual.

#### Como e quando pode ser usada:
  * Utilizada no mecanismo de desfazer (ctrl+z) em editores de texto
  * Usada em compiladora para verificar pares de chaves ou colchetes na sintaxe.
  * Pode ser utilizada para modelar uma pilha de livros ou pratos.
  * Utilizada por baixo dos panos para suportar recursão mantendo o rastreio das chamadas de funções anteriores.
  * Pode ser utilizada na Depth First Search (DFS) em grafos.

#### Complexidade de Stacks:
  | Push | Pop  | Ver se existe | Busca | Saber tamanho |
  |:----:|:----:|:-------------:|:-----:|:-------------:|
  | O(1) | O(1) |     O(1)      | O(n)  |     O(1)      |

#### Filas:
  * É uma estrutura de dados linear que imita o funcionamento de uma fila.
  * Elementos são inseridos ao final da fila e retirados do começo, assim como uma fila na vida real.
  * Tem duas operações primarias, *enqueue*(enfileirar) e *dequeue*(desenfileirar).

#### Como e quando pode ser usada:
  * Qualquer modelo de fila de espera, uma fila de cinema por exemplo.
  * Pode ser usada para observar o elemento n mais recem adicionado de forma eficiente.
  * Usada em gerenciamento de webservers.

#### Complexidade da fila:
  | Enfileira | Desenfileirar | Peeking | Contains | Remover | Verificar se é vazio |
  |:---------:|:-------------:|:-------:|:--------:|:-------:|:--------------------:|
  |   O(1)    |     O(1)      |  O(1)   |   O(n)   |  O(n)   |         O(1)         |

#### Fila com prioridade:
  * É uma ADT que opera de forma similiar a uma fila normal, porém *cada elemento tem uma certa prioridade*
  * A prioridade dos elementos determina a ordem em que são removidos da fila.
  * Suportam somente tipos de dados que podem ser comparados, seja do melhor para o pior, pior para o melhor ou de outra forma.
  * Tem sua base formada por heaps (estrutura de dados baseada em arvore) onde **seguem a regra que o nó filho pode ser menor ou igual/maior ou igual ao nó pai**.

#### Como e quando pode ser usada:
  * Utilizada em algumas implementações do algoritmo de Dijkstra para buscar o próximo nó.
  * Usada quando é preciso *buscar de forma dinamica o proximo melhor ou proximo pior elemento.*
  * Utilizada no Huffman Encoding(que é utilizado para fazer compressão de data sem perda de dados).
  * Algoritmos de BFS como A* utilizam PQs(Priority Queues) para continuamente pegar o próximo nó mais promissor.
  * Utilizado pelo algoritmo Minimum Spanning Tree (MST).

#### Complexidade de Filas de prioridade utilizandos HEAPS:
  | Contrução do Heap binário |  Polling  | Peeking |  Adding   | Saber tamanho | Remover elemento(linear) | Remover elemento(Hash table) | Naive Contains(Contains) | Advanced Contains(Hash Table) |
  |:-------------------------:|:---------:|:-------:|:---------:|:-------------:|:------------------------:|:----------------------------:|:------------------------:|:-----------------------------:|
  |           O(n)            | O(log(n)) |  O(1)   | O(log(n)) |     O(1)      |           O(n)           |          O(log(n))           |           O(n)           |             O(1)              |

#### Converter Min PQ para Max PQ:
 * É comum as bibliotecas padrão proverem somenete Filas de prioridade minima ordenadas pelo menor elemento primeiro, mas as vezes
 é preciso uma MAX PQ.
 * Como os elementos da fila são comparáveis existe algum tipo de implementação de ordenação que podemos inverter para criar o MAX PQ.
 * Outra forma de converter seria negando o valor na insersão depois negando novamente na retirada do valor da fila.

#### Adicionando elementos em um Heap Binário:
  * Utilizamos Heap para implmentar uma PQ porque tem as melhroes possibilidades de complexidade de tempo.
  * Como PQ são ADTs podem ser implementadas utilizando outras estruturas de dados.
  * Um heap binário pode ter suas posições representadas em um Array
  * Podemos utilizar formulas para achar os filhos a esquerda e direito de um nó.
    * Caso **i seja o id do nó** temos: 
      * Filho a esquerda -> 2i + 1
      * Filho a direita -> 2i + 2
  * Ao inserir o valor ele irá para a direita do ultimo elemento da ultima camada, ao ser inserido será validado se ele se 
  adequa a regra de MIN PQ ou MAX PQ, caso não se adeque trocará de lugar com o nó pai até se adequar.

#### Removendo elemento de um Heap Binário:
  * Podemos utiliza o Poll() para remover o relemento da Raiz.
  * Temos que remover o *nó raiz, já que ele tem a maior prioridade*.
  * Iremos trocar o nó raiz com o ultimo nó, após removemos o ultimo nó. O nó raiz não irá satisfazer as regras do Heap então temos
  que fazer o *Bubbling Down* que é verificar o nó filho com menor valor e inverter com o nó pai, isso ser feito até satifazer a regra do HEAP.
  * Sempre que os nós *filhos forem iguais selecionaremos o nó da esquerda*.
  * *Sempre saberemos quais são os primeiro e ultimos valores pois o primeiro sempre será o 0 do arrya e o ultimo será o maior id*.
  * Podemos utilizar o **remove(elemento)** para remover o elemento em qualuqer posição
  * Para isso temos que fazer uma busca para achar o elemento e seu Id, depois iremos troca ele com o utlimo elemento, após removemos o
  ultimo elemento e fazemos o *Bubbling Up* com o ultimo elemento que foi trocado.
  * Podemos utiliza um HashMap para remover qualquer elemento com complexidade O(log(n))

#### Arvores binárias e Arvores de busca binária:
  * São grafos unidirecionais que satisfazem as regras a seguir
    * Um grafo aciclico
    * Um grafo conectado com N nós e N-1 arestas
    * Cada dupla de valores tem que ser conectada por somente um caminho.
  * Toda arvore *tem que ter uma referência para o nó raiz*, nem sempre importa qual nó será o raiz, já que qualquer um pode ser.
  * ***Um filho é um nó que extende de outro nó, já o pai é o que é extendido pelo outro nó***.
  * Como o nó raiz não tem pai as vezes é bom atribuir ele mesmo como pai.
  * Um *nó folha* é aquele que não tem filho.
  * Também existe subarvores que são arvores que estão dentro de outra arvore (um nó unico pode ser uma subarvore).

#### O que é uma Arvores de busca binária:
  * É uma arvore vinário que satisfaz as regras da BST(Binar Search Tree), sendo elas:
    * Subarvore a esquera tem elementos menores e subarvore a direita tem elementos maiores.

#### Como e quando pode ser usada:
  * BST pode ser usada para:
    * Implementar alguns ADTs de Map e Set
    * Red Black Trees
    * AVL Trees
    * Spla Trees
  * Utilizadas para implementação de heap binário
  * Arvorse de sintáxe (usado por compiladores e calculadoras)
  * Treap - uma estrutura de dados probabilistica.

#### Complexidade de BSTs:
  | Operações |   Media   | Pior  |
  |:---------:|:---------:|:-----:|
  |  Insert   | O(log(n)) | O(n)  |
  |  Delete   | O(log(n)) | O(n)  |
  |  Remove   | O(log(n)) | O(n)  |
  |  Search   | O(log(n)) | O(n)  |

#### Adicionando elementos em uma BST:
  * Os elementos tem que ser comparáveis para que possam ser ordenados dentro da arvore.
  * Quando inserido um elemento queremos comparar o seu valor como valor armazenado no nó atual para decidir o seguinte:
    * Inserir na subarvore a esquerda (menor que)
    * Inserir na subarvore a direita (mairo que)
    * Lidar quando for duplicata (igual a)
    * Criar um novo nó (achar uma folha null)

#### Removendo elementos de uma BST:
  * Podemos considerar uma etapa com dois passos:
    * *Busca* o elemento que queremos remover (se existir)
    * *Trocar* o nó que queremos com o seu sucessor para manter a regra da BST
#### Fase da busca:
  * Pode acontecer as seguintes coisas ao buscar um valor definido:
    * Achar um nó null, assim sabemos que o valor não existe na BST.
    * Valor de comparação igual a 0 (Achamaos)
    * Valor de comparação menor que 0 (O valor, caso exista, está na subarvore a esquerda)
    * valor de comparaçaõ mairo que 0 (O valor, caso exista, está na subarvore a direita)
#### Fase de remoção:
  * Tem 3 diferentes casos:
    * *Nó folha, quando não tem filhos:*
      * Nesse caso podemos remover sem nenhum problema, já que não terá efeito colateral.
    * *Nó a ser removido tem um subarvore somente a esquerda ou a direita:*
      * Nesse caso o sucessor do número a ser removido se tornará o nó raiz da subarvore, o sucessor vai passar a ser filho direto
      do antecessor do número removido.
    * *Nó a ser removido tem subarvore tanto a esquerda quando a direita:*
      * Podemos remover das duas subarvores, vai depeneder do que queremos.
        * O sucessor do nó que queremos remover pode ser o maior valor na subarvore a esquerda ou o menor valor na subarvore da direita.
        * A justificativa é de que o maior valor a esquerda satisfaz as regras da BST já que:
          * É maior do que qualquer outro na arvore a esquerda e é menor to que todos da arvore da direita.
        * O menor valor a direita também satizfas as regras, já que é menor do que qualquer outro da árvore a direita e também
        maior do que todos na árvore a esquerda.