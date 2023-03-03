package com.workshop.concurrency.tij;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends Liftoff {
    @Override
    public void run() {
        while (countdown-- > 0) {
            System.out.println(status());
            try {
                TimeUnit.MILLISECONDS.
                    sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new SleepingTask());
        }
        executorService.shutdown();
        System.out.println("Main exit");
    }
}
