package com.workshop.concurrency.tij;

public class BasicThread {
    public static void main(String[] args) {
        new Thread(new Liftoff()).
            start();

        System.out.println("Main Exit");
    }
}
