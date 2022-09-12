package com.nitinrane.learning.java.concurrency.tij;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException,
        InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add(executorService.
                submit(new TaskWithResult(i)));
        }
        executorService.shutdown();

        for (Future<String> future : result) {
            System.out.println(future.get());
        }
    }
}
