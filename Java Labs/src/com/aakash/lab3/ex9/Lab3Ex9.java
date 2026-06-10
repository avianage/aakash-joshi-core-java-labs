package com.aakash.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;

public class Lab3Ex9 {

    public static void printDurationFromCurrent(LocalDate inputDate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(inputDate, currentDate);

        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());

        System.out.println("Duration:");
        System.out.println("Years  : " + years);
        System.out.println("Months : " + months);
        System.out.println("Days   : " + days);
    }

    public static void main(String[] args) {
        LocalDate customDate = LocalDate.of(2020, 5, 15);
        printDurationFromCurrent(customDate);
    }
}
