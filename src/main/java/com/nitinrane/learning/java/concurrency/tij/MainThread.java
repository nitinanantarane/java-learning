package com.nitinrane.learning.java.concurrency.tij;

public class MainThread {
    public static void main(String[] args) {
        Liftoff launch = new Liftoff();
        launch.run();
        System.out.println("Main Exit");
    }
}
