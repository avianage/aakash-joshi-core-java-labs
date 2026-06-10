package com.aakash.lab8.ex2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeRunnable implements Runnable {
    @Override
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        System.out.println("Timer started. Refreshing every 10 seconds...");

        while (!Thread.currentThread().isInterrupted()) {
            LocalTime currentTime = LocalTime.now();
            System.out.println("Current Time: " + currentTime.format(formatter));
            
            try {
                Thread.sleep(10000); // 10-second delay
            } catch (InterruptedException e) {
                System.out.println("Timer thread was stopped safely.");
                break; 
            }
        }
    }
}
