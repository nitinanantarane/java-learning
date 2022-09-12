package com.nitinrane.learning.java.concurrency.tij;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executor.execute(new Liftoff());
        }
        executor.shutdown();
        System.out.printf("Active %s \n", Thread.activeCount());
        System.out.println("Main Exit");
    }
}
