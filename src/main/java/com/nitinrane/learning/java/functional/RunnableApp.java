package com.nitinrane.learning.java.functional;

public class RunnableApp {

        public static void main(String[] args) {
                Runnable runnable = () -> System.out.println("I am running");

                new Thread(runnable).start();
        }
}
