package com.nitinrane.learning.java.functional;

import java.util.Random;
import java.util.function.BiConsumer;

public class BiConsumerApp {
        public static void main(String[] args) {
                BiConsumer<Random, Integer> biConsumer = (a, b) -> {
                        for (int i = 0; i < b; i++) {
                                System.out.println("Next Random number : " + a.nextInt(10));
                        }
                };

                biConsumer.accept(new Random(314L), 5);
        }
}
