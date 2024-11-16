# Trabalhando com arquivos e apis
 
## Arquivos:
 - Existem  duas apis para trabalhar com arquivos, **java.io.File** e **java.nio.file.Path**. Atualmente a Path é mais utilizada
    podemos encontrar aplicações antigas que ainda utilizem a File já que não está depreciada.

## APIs:
 - A conexão com APIs é feita utilizando uma chamada HTTP
   - As chamadas em java podem ser feitas pelas *classes HttpURLConnection e HttpClient*
   - HttpCliente veio para substituir a HttpURLConnection com mais funcionalidades, utilizando HTTP/2 e WebSocket 
   - Algumas bibliotecas ainda utilizam a HttpURLConnection como ApacheHttpClient e Spring's RestTemplate

### HttpClient:
- Tem mecanimos de requisições sincronas e assincronas
  - Consiste de 3 classes base: HttpRequest, HttpClient e HttpResponse
    - HttpRequest: É o objeto que representa a requisição, pode ser instanciado utilizando *HttpRequestBuilder*.
      A classe *HttpRequest.newBuilder().build* tem varios metodos para configurar a requisição.
    - HttpClient: Funciona como um container com as configurações em comum para varias requisições.
      - Todas as requisições são feitas utilizando *HttpClient*. Pode ser instanciada pela *HttpClient.newBuilder()* 
        ou chamando *HttpClient.newHttpClient()*.
    - HttpResponse: Representa o *resultado da chamada HttpRequest*. Tem diversos metodos porém os mais imporatantes são:
      *statusCode()* que retorna os status da requisição em um int e *body()* que retorna o conteudo no corpo da resposta.