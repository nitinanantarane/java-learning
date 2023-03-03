package com.workshop.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApp {

        public static void main(String[] args) {
                List<String> strings = Arrays.asList("Hi", "Bye", "Hello", "cal");

                System.out.println(retainListOfLength3(strings));
        }

        static List<String> retainListOfLength3(List<String> strings) {
                List<String> result = new ArrayList<>();
                Predicate<String> predicate = s -> s.length() == 3;

                for (String s : strings) {
                        if (predicate.test(s)) {
                                result.add(s);
                        }
                }

                return result;
        }
}
