package com.nitinrane.learning.java.v18;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {

    public static void main(String... args) {
        String wordsAndNumbers = """
                Longing rusted furnace
                daybreak 17 benign
                9 homecoming 1 benign
                freight car
                """;

        try (Scanner scanner = new Scanner(wordsAndNumbers)) {
            scanner.findAll("benign")
                    .map(MatchResult::group)
                    .forEach(System.out::println);
        }
    }
}
