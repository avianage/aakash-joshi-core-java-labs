package com.aakash.lab8.ex2;

public class TimerProgram {
    public static void main(String[] args) {
        TimeRunnable timerRunnable = new TimeRunnable();
        Thread timerThread = new Thread(timerRunnable);
        
        timerThread.start();
    }
}
