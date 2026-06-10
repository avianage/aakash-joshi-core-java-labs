package com.aakash.lab9.ex1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimerTask implements Runnable {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void run() {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime.format(formatter));
    }
}
