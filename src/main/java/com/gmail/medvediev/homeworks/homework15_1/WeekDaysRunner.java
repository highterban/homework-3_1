package com.gmail.medvediev.homeworks.homework15_1;

public class WeekDaysRunner {
    public static void main(String[] args) {

        WeekDaysAdvice giveAdvice = new GiveAdvice();

        giveAdvice.advise(WeekDays.MONDAY);
        giveAdvice.advise(WeekDays.FRIDAY);
        giveAdvice.advise(WeekDays.SUNDAY);
    }
}