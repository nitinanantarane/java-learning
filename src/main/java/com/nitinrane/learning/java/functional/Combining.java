package com.nitinrane.learning.java.functional;

import java.util.Objects;
import java.util.function.Predicate;

public class Combining {

    public static void main(String[] args) {
        Predicate<String> nonNull = s -> s != null;
        Predicate<String> nonEmpty = s -> !s.isEmpty();
        Predicate<String> shorterThan5 = s -> s.length() < 5;

        Predicate<String> p = nonNull.and(nonEmpty).and(shorterThan5);
        System.out.println(p.test("java"));

        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
        Predicate<String> isNotNullNorEmpty = isNullOrEmpty.negate();
        Predicate<String> shortThan5 = s -> s.length() < 5;

        Predicate<String> predicate = isNotNullNorEmpty.and(shortThan5);
        System.out.println(predicate.test("nitin"));
        System.out.println(predicate.test(null));
        System.out.println(predicate.test("java"));


    }
}
