package com.workshop.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class PredicateFactory {

    public static void main(String[] args) {
        Predicate<String> isEqualToDuke = Predicate.isEqual("Duke");
        System.out.println(isEqualToDuke.test("Duke"));
        System.out.println(isEqualToDuke.test("Java"));

        Predicate<Collection<String>> isEmpty = Collection::isEmpty;
        Predicate<Collection<String>> isNotEmpty = Predicate.not(isEmpty);
        System.out.println(isNotEmpty.test(new ArrayList<>()));

        Logger log = Logger.getLogger("MyApplicationLogger");
        Consumer<String> logger = message -> log.info(message);
        logger.accept("AWS");

        Consumer<String> print = System.out::println;
        print.accept("java");

        Consumer<String> printAndLog = logger.andThen(print);
        printAndLog.accept("python");



    }
}
