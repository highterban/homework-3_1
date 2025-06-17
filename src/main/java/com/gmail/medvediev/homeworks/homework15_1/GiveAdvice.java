package com.gmail.medvediev.homeworks.homework15_1;

public class GiveAdvice implements WeekDaysAdvice {
    @Override
    public void advise(WeekDays weekDays) {
        switch (weekDays) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Порада: Зосередьтесь на роботі, складіть план і не відкладайте завдання.");
            case FRIDAY ->
                    System.out.println("Happy Friday!");
            case SATURDAY, SUNDAY ->
                    System.out.println("Рекомендую відвідати парк, музей або провести час з друзями.");
        }
    }
}
