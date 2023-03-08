package com.workshop.tij.polymorphism.shape;

import static com.workshop.tij.util.Print.print;

public class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }

    public void erase() {
        print("Triangle.erase()");
    }
}