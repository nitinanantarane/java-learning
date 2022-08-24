package com.nitinrane.learning.java.functional;

import java.util.function.*;

public class MethodReference {

    public static void main(String[] args) {
        Consumer<String> printer = System.out::println;
        printer.accept("Hello World!");

        DoubleUnaryOperator sqrt = Math::sqrt;
        System.out.println(sqrt.applyAsDouble(2.2));

        IntBinaryOperator max = Math::max;
        System.out.println(max.applyAsInt(5, 3));

        Function<String, Integer> toLen = String::length;
        System.out.println(toLen.apply("nrane"));

        BiFunction<String, String, Integer> indexOf = String::indexOf;
        System.out.println(indexOf.apply("india", "n"));


    }
}
