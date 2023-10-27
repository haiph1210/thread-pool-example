package com.haiph;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        long startTime = System.currentTimeMillis();
//        testThread(100, 5);
        testNoThread(100);
        long endTime = System.currentTimeMillis();
        float executionTimeInSeconds = (float) (endTime - startTime) / 1000;
        System.out.println("Thời gian thực thi: " + executionTimeInSeconds + " giây");
    }

    public static void testThread(Integer totalEntries, Integer numThreads) {
        int entriesPerThread = totalEntries / numThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        for (int i = 0; i < numThreads; i++) {
            int start = i * entriesPerThread;
            int end = (i + 1) * entriesPerThread;
            executor.submit(new ThreadPool(start, end));
        }
        executor.shutdown();
    }

    public static void testNoThread(Integer totalEntries) {
        for (Integer i = 0; i < totalEntries; i++) {
            System.out.println("Log entry " + (i + " hi "));
        }
    }
}
