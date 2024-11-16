package org.example.generics;

public class GenericsDemo {
    //Declaração do metodo generico antes do tipo de retorno
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Arrays de diferentes tipos
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Integer Array:");
        printArray(integerArray);

        System.out.println("Double Array:");
        printArray(doubleArray);

        System.out.println("String Array:");
        printArray(charArray);
    }
}
