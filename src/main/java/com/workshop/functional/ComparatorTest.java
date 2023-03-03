package com.workshop.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.naturalOrder;

public class ComparatorTest {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("one", null, "two", null, "three", null, "four");
        Comparator<String> naturalNullLast = Comparator.nullsLast(naturalOrder());
        numbers.sort(naturalNullLast);
        System.out.println(numbers);

    }
}
