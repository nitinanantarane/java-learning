package com.nitinrane.learning.java.functional;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierApp {
        public static void main(String[] args) {
                Random random = new Random(324L);

                Supplier<Integer> supplier = () -> random.nextInt(10);
                for (int i = 0; i < 5; i++) {
                        System.out.println("Supplier " + supplier.get());
                }

                IntSupplier intSupplier = () -> random.nextInt(10);
                for (int i = 0; i < 5; i++) {
                        System.out.println("IntSupplier " + intSupplier.getAsInt());
                }

                DoubleSupplier doubleSupplier = () -> random.nextDouble(10);
                for (int i = 0; i < 5; i++) {
                        System.out.println("DoubleSupplier " + doubleSupplier.getAsDouble());
                }

        }
}
