package com.nitinrane.learning.java.concurrency;

public class MountainTrackerApp {

    public static final int TOTAL_TRACKERS = 5;
    public static final int TOTAL_CHECK_POINTS = 5;

    public static void main(String[] args) throws InterruptedException {
        MountEverest mountEverest = new MountEverest();

        for (int i = 0; i < TOTAL_TRACKERS; i++) {
            new Thread((new TrackerTask(mountEverest))).start();
        }

        System.out.println("Main exits");
    }

}

class MountEverest {

    private int counter;
    private boolean flag;

    public synchronized void checkpoint() throws InterruptedException {
        flag = (++counter) % MountainTrackerApp.TOTAL_TRACKERS == 0;
        //System.out.println(flag + " " + counter);

        if (!flag) {
            //System.out.println(Thread.currentThread().getName() + " waiting..");
            wait();
            //System.out.println(Thread.currentThread().getName() + " awake..");
        } else {
            notifyAll();
        }
    }

}
class TrackerTask implements Runnable {

    private MountEverest mountEverest;
    TrackerTask(MountEverest mountEverest) {
        this.mountEverest = mountEverest;
    }

    @Override
    public void run() {
        for (int i = 0; i < MountainTrackerApp.TOTAL_CHECK_POINTS; i++) {
            System.out.println(Thread.currentThread().getName() + " => " + i + " ");

            try {
                mountEverest.checkpoint();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println(Thread.currentThread().getName() + " exits");
    }
}