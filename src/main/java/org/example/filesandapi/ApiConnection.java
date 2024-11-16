package org.example.filesandapi;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ApiConnection {
    //Utilizando HttpClient

    //Criando o cliente para enviar a requisição
    HttpClient client = HttpClient.newHttpClient();

    //Configurando a URI da requisicao
    HttpRequest request;

    public void uriConfigGet() throws URISyntaxException {
        request = HttpRequest.newBuilder()
                .uri(URI.create("https://postman-echo.com/get"))
                .version(HttpClient.Version.HTTP_2) //As vezes é preciso indicar qual a versão do HTTP
                .timeout(Duration.of(10, ChronoUnit.SECONDS)) //Especificando o tempo de espera maximo da resposta
                //.header para colocar algo no header da requisiÇão
                .GET()
                .build();
        System.out.println(request);
    }

    public void nasaRequest() throws IOException, InterruptedException {
        request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY"))
                .header("accept", "application/json")
                .build();

        /*
        - Utilizando o cliente para mandar a requisição
        - pode ser utilizado sendAsync caso a performance seja necessário
         */
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); //Tem que fazer uma classe para tratar o json recebido ao invez de utilizar ofString

        System.out.println(response.body());
    }



    /*
    ------------------
     - Utlizando HttpURLConnection
    */

    public void nasaUrlConnection() throws IOException {
        //Cria um objeto para armazenar a url
        URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");

        //Abrir uma conexão coma url
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        //Configurar o tipo da request, cabeçalho etc
        urlConnection.setRequestProperty("accept", "application/json");

        //Fazendo a requisição
        InputStream inputStream = urlConnection.getInputStream();

        //É preciso fazer um tratametno do response para APOD utilizando Jackson
        System.out.println(inputStream.toString());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ApiConnection newApi = new ApiConnection();
        newApi.nasaRequest();
    }
}
