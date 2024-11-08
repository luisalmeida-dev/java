package org.example.oop.polymorphism;

public class Splendor extends Bike {
    @Override
    void run() {
        System.out.println("Running safely with 60km");
    }

    public static void main(String[] args) {
        Bike bike = new Splendor();
        bike.run();
    }
}
