package com.haiph;

public class ThreadPool implements Runnable {

    private int start;
    private int end;

    public ThreadPool(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            System.out.println("Log entry " + (i + " hi " ));
//            for (int j = 0; j < end-start; j++) {
//
//            }
        }
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
