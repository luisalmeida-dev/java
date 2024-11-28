package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenevo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        //Filtrando os produtos mais caros do que 30000 utilizando stream
        List<Float> productPriceList = productList.stream()
                .filter(p -> p.getPrice() > 30000) //filtrando os dados
                .map(p -> p.getPrice()) //pegando o preco da stream de produtos
                .collect(Collectors.toList()); //colocando em uma lista
        System.out.println(productPriceList);
    }

}
