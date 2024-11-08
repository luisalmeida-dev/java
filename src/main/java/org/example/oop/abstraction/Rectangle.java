package org.example.oop.abstraction;

public class Rectangle extends GraphicObject{

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    void resize() {
        System.out.println("Resizing the rectangle");
    }
}
