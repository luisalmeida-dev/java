# Spark Framework

- É um micro framework para criar aplicações web de forma rapida
- Foi baseada na framework Sinatra do Ruby.
- *Utiliza bastante expressão lambda* tornando o códiga menos verboso.
- Não tem muita dependência de arquivos XML e anotações como outra frameworks do java.
- Tem a porta 4

# Rotas:

- As rotas em Spark são *compostas por tres partes*:
    - **Verbo**: É o metodo correspondente ao *tipo HTTP*, incluem: GET, POST, PUT, DELETE, HEAD, TRACE,CONNECT E
      OPTIONS.
    - **Caminho**: Também chamado de padrão de rota, determina qual URIs a rota deve escutar e providênciar uma
      resposta.
    - **Callback**: É uma função que é executada quando uma condição for atendida, geralmente uma requisição HTTP a uma
      rota. *O processamento fica dentro do callback e é executado retornando algo como resposta.*

```java
//Expressão lambda é o callback, GET o verbo e "/hello" o caminho
public class MeuApp {
    public static void main(String[] args) {
        get("/hello", (req, res) -> {
            return "Hello, world!";
        });
    }
}
```