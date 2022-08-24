package com.nitinrane.learning.java.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {

        public static void main(String[] args) {
                Consumer<String> consumer = s -> System.out.println(s);
                consumer.accept("Apple");
                consumer.accept("Mango");
                consumer.accept("Banana");

                System.out.println(calculateTotalPrice(Arrays.asList(
                        new Product(30), new Product(20))
                ));

        }

        static float calculateTotalPrice(List<Product> products) {
                final float[] totalPrice = {0};
                Consumer<Product> consumer = s -> totalPrice[0] += s.getPrice();
                for (Product product : products) {
                        consumer.accept(product);
                }

                return totalPrice[0];
        }

        static class Product {
                float price;

                public Product(float price) {
                        this.price = price;
                }

                public float getPrice() {
                        return price;
                }
        }
}

