package org.example.sparkframework;

import static spark.Spark.*;

public class SparkApi {
    public static void main(String[] args) {
        //Criacao basica de rotas
        get("/hello", (req, res) -> "Hello World");

        get("/hello/:name", (req, res) -> "Hello, " + req.params(":name"));
    }
}
