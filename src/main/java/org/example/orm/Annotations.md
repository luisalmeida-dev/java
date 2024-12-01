# ORM

- São metodos de programação *utilizados para mapear objetos do java para entidades relacionais em uma base de dados*
- Providência metodos par não utilizarmos queries SQL na mão.

## Tipos de ORM:

### Padrão de registro ativo:

- *Mapeia os dados dentro da estrutura do código*, é gerenciado por classes e estruturas dentro do código.
- *A estrutura do banco está firmemente conectada ao código, dificultando a remoção do bando de dados e migração para um
  aplicativo diferente.*

### Padrão de mapeador de dados:

- *Tenta desacoplar a lógica de negócios* nos objetos do banco de dados.
- Pode facilitar a troca de banco de dados e o uso da mesma lógica de programação.

### Prós:

- Minimiza a quantidade de conhecimento SQL necessária para conectar uma base a uma aplicação.
- Gera SQL automaticamente, assim o programador pode focar na regra de negócio.
- Há quatro beneficios de utilizar ORM:
    - **Produtividade** (Não ter que fazer a conexão e as queries SQL na mão salvam tempo).
    - **Design de aplicação** (Um ORM bem escrito vai ajudar a utilizar boas praticas no design da aplicação).
    - **Reuso de código**
    - **Reduzir teste** (O código gerado por ORM já é bem testado, então o dev pode focar na regra de negócio e codigo).

### Cons:

- Geralmente uma aplicação complexa não se dá bem com o alto nivel de abstração das ORMs
    - **Performance** (ORM pode gerar código desnecessário, diminuindo performance e deixando mais dificil de manter).
    - **Necessidade de saber SQL** (Alto nivel de abstração nem sempre gera o melhor código, então o Dev ainda tem que
      saber SQL).
    - **Mapeamento ruim** (Pode errar o mapeamento entre tabelas e objetos, o problema pode ser dificil de reconhecer).
    - **Schema e Migrations** (Uma ORM ruim pode dificultar a melhora de schemas de bancol. Também pode atrapalhar em
      migrations)

## JPA(Jakarta Persistence API):
- É um *conjunto de interfaces para acessar, persistir e gerenciar dados entre objetos Java e uma base relacional*.
- Features:
  - Limpo, facil, ORM padronizada.
  - Suporta herança, polimorfismo e consultas polimóficas.
  - Suporta anotação de meta-dados/Descritores XML
  - Usa uma linguagem rica no estilo SQL para queries dinamicas e estáticas
  - Persistências plugáveis assim como Hibernate
  - Caching

## Spring Data JPA:
- Tem o foco de melhorar a implementação das camadas de acesso a dados reduzindo o esforço necessários.
- O Dev escreve uma interface repository e *será incluso metodos para busca de dados automaticamente.*

## Hibernate:
- Fornece uma framework para fazer mapeamento objeto-relacional.

## Ebean:
- Ferramenta escriva em java.
- Suporta as anotações padrões do JPA para declarar entidades.
- Tem uma API de persistência bem mais simples.