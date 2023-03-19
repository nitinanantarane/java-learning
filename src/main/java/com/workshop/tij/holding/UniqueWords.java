package com.workshop.tij.holding;

import com.workshop.tij.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("D:\\workspace\\java-learning\\src\\main\\java\\com\\workshop\\tij\\holding\\SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}