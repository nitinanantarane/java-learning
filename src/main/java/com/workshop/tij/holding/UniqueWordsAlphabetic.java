package com.workshop.tij.holding;

import com.workshop.tij.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsAlphabetic {
 public static void main(String[] args) { 
 Set<String> words =
 new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
 words.addAll( 
 new TextFile("D:\\workspace\\java-learning\\src\\main\\java\\com\\workshop\\tij\\holding\\SetOperations.java", "\\W+"));
 System.out.println(words); 
 } 
}