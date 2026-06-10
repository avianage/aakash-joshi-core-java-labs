package com.aakash.lab8.ex2;

public class TimerProgram {
    public static void main(String[] args) {
        TimerRunnable timerRunnable = new TimerRunnable();
        Thread timerThread = new Thread(timerRunnable);
        
        timerThread.start();
    }
}
