package com.workshop.tij.flowcontrol;

public class ForEachString {
    public static void main(String[] args) {
        String str = "An African Swallow";
        for (char ch : str.toCharArray()) {
            System.out.print(ch + " ");
        }
    }
}
