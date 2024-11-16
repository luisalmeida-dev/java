package org.example.generics;

//A declaração da classe é a mesma, porém vem a marcação do generics apos o nome da classe
public class Box<T>{
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        //Instanciando o mesmo objeto com diferentes tipos
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(10);
        stringBox.add("Hello World");

        System.out.printf("Integer Value :%d%n", integerBox.get());
        System.out.printf("String Value :%s", stringBox.get());
    }
}
