package com.workshop.tij.initclean;

public class MethodInit2 {
    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}