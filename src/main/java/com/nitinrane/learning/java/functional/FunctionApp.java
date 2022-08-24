package com.nitinrane.learning.java.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionApp {

    public static void main(String[] args) {
        Function<String, String> myfunc1 = s -> s.toUpperCase();
        String wo = "Java is cool!";
        String up = myfunc1.apply(wo);
        System.out.println(up);

        Function<String, Integer> myfunc = s -> s.length();
        String word = "Java is cool!";
        int len = myfunc.apply(word);
        System.out.println(len);

        List<String> strings = Arrays.asList("one", "two", "three");
        UnaryOperator<String> toUpperCase = w -> w.toUpperCase();
        strings.replaceAll(toUpperCase);
        System.out.println(strings);

        BiFunction<String, String, Integer> biFunction = (text, sentence) -> sentence.indexOf(text);
        System.out.println(biFunction.apply("it", "nitin"));

        Function<String, String> id = Function.identity();
        System.out.println(id.apply("hello"));

    }
}
