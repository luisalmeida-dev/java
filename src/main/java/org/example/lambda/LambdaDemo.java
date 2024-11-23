package org.example.lambda;

import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        numbers.forEach(n -> System.out.println(n));
    }
}
