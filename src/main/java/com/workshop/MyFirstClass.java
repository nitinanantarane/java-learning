package com.workshop;

import java.util.Random;

public class MyFirstClass {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        System.out.print(random.nextInt(1,6) + " ");
    }
}