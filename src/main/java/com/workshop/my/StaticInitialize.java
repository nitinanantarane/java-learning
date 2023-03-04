package com.workshop.my;

public class StaticInitialize {
    static String name = getName();
    static String str;

    static {
        System.out.println("Hi");
    }

    static String getName() {
        System.out.println("before hello");
        return "hello";
    }
    static void print() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        print();
    }
}
