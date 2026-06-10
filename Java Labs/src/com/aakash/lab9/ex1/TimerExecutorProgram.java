package com.aakash.lab9.ex1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerExecutorProgram {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        
        System.out.println("Timer started via Executor. Refreshing every 10 seconds...");
        
        scheduler.scheduleAtFixedRate(new TimerTask(), 0, 10, TimeUnit.SECONDS);
    }
}
