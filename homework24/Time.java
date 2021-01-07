package javacore.homework24;

public class Time {
    int min;
    int hour;

    Time(int min, int hour) {
       // if ((min < 0 || min > 60) || (hour < 0 || hour > 24)) {
       //     throw new IllegalArgumentException("Невірний час");
        //}
        this.min = min;
        this.hour = hour;
    }


}
