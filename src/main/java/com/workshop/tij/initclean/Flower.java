package com.workshop.tij.initclean;

import static com.workshop.tij.util.Print.print;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        print("Constructor w/ int arg only, petalCount= "
                + petalCount);
    }

    Flower(String ss) {
        print("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
//! this(s); // Can’t call two! 
        this.s = s; // Another use of "this"
        print("String & int args");
    }

    Flower() {
        this("hi", 47);
        print("default constructor (no args)");
    }

    void printPetalCount() {
//! this(11); // Not inside non-constructor! 
        print("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}