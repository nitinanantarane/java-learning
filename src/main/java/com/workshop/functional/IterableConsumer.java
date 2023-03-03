package com.workshop.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterableConsumer {
        public static void main(String[] args) {
                List<String> fruits = Arrays.asList("Mango", "Apple", "Oranges");
                Consumer<String> consumer = s -> System.out.println(s);
                fruits.forEach(consumer);
        }
}
