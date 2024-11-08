package org.example.oop.abstraction;

public class Circle extends GraphicObject{
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    void resize() {
        System.out.println("Resizing the circle");
    }
}
