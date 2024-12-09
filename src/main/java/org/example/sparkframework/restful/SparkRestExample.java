package org.example.sparkframework.restful;

import com.google.gson.Gson;

import static spark.Spark.*;


// Classe onde ficam as rotas da API, basicamente com uma controller
public class SparkRestExample {

    public static void main(String[] args) {
        final UserService userService = new UserServiceImpl(); // Injecao de dependencia

        /*
         - Funcao para adicionar usuario, json é passado no corpo da requisição
         */
        post("/users", (req, res) -> {
            res.type("application/json"); //Definindo o tipo de resposta como Json
            UserEntity user = new Gson().fromJson(req.body(), UserEntity.class); //Utilizando a biblioteca Gson para transformar o json em UserEntity
            userService.addUser(user);

            return new Gson().toJson(new StandardResponse(StatusResponseEnum.SUCCESS)); //Criando uma StandarResponse e transforbando em json coma biblioteca
        });

        /*
        - Funcao para pegar todos os usuarios
        */
        get("/users", (req, res) -> {
            res.type("application/json");
            return new Gson().toJson(
                    new StandardResponse(StatusResponseEnum.SUCCESS, new Gson() //Criando uma StandarResponse e transformando em Json, JsonTree por ter mais de um elemento no json
                            .toJsonTree(userService.getUsers())));
        });

        get("user/:id", (req, res) -> {
            res.type("application/json");
            return new Gson().toJson(new StandardResponse(StatusResponseEnum.SUCCESS, new Gson().toJsonTree(userService.getUser(req.params(":id")))));
        });

        put("/users/:id", (req, res) -> {
            res.type("application/json");

            UserEntity toEdit = new Gson().fromJson(req.body(), UserEntity.class);
            UserEntity editedUser = userService.editUser(toEdit);

            if (editedUser != null) {
                return new Gson().toJson(new StandardResponse(StatusResponseEnum.SUCCESS, new Gson().toJsonTree(editedUser)));
            } else {
                return new Gson().toJson(new StandardResponse(StatusResponseEnum.ERROR, new Gson().toJson("User not found or error in edit")));
            }
        });

        delete("/user/:id", (req, res) -> {
            res.type("application/json");
            userService.deleteUser(req.params(":id"));
            return new Gson().toJson(new StandardResponse(StatusResponseEnum.SUCCESS, "User delete"));
        });

        /*
        - O metodo Options é bom para fazer validações condicionais, o código a seguir valida se um id existe
        */
        options("/user/:id", (req, res) -> {
            res.type("application/json");
            return new Gson().toJson(new StandardResponse(StatusResponseEnum.SUCCESS, (userService.userExist(req.params(":id"))) ? "User exists" : "User does not exists"));
        });
    }
}
