package com.workshop.tij.polymorphism.shape;

import static com.workshop.tij.util.Print.print;

public class Circle extends Shape {
    public void draw() {
        print("Circle.draw()");
    }

    public void erase() {
        print("Circle.erase()");
    }
}