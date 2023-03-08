package com.workshop.tij.polymorphism.shape;

import static com.workshop.tij.util.Print.print;

public class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
}