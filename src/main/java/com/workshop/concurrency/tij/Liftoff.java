package com.workshop.concurrency.tij;

public class Liftoff implements Runnable {
    private static int count;
    private final int id = count++;
    protected int countdown = 10;

    public Liftoff() {}

    public Liftoff(int countdown) {
        this.countdown = countdown;
    }

    @Override
    public void run() {
        while (countdown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }

    protected String status() {
        return "# " + id + "(" +
            (countdown > 0 ? countdown : "Liftoff") + ")";
    }
}
