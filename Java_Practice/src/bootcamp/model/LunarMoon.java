package com.bootcamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LunarMoon {
    public static void main(String [] args){
        //how many blue moons will there be from 2000 to 2999

        //lunar month is 29 days, 12 hours, 44 minutes
//        long lunarMoon = (29*24*60*60) + (12*60*60) + (44*60);
//        System.out.println(lunarMoon);
        //July 2015 1st and 31st July 2 02:19
        LocalDateTime pastDate = LocalDateTime.of(2000, 01, 01, 00, 00, 00);
        int blueMoonCounter = 0;

        while(pastDate.getYear() <= 2999){
//            System.out.println("Current year = " + pastDate.getYear()
//                                + " Current month = " + pastDate.getMonthValue() +
//                                    "Current date = " + pastDate.getDayOfMonth());

//            long currentSeconds = pastDate.getTime();
//            long diff = currentSeconds - lunarMoon;
//            Date currentDate = new Date(diff);
            LocalDateTime currentDate = pastDate.plusDays((long) 29.5);
//            System.out.println("Current Date = " + currentDate);
//            if((currentDate.getYear() % 4 == 0) && (currentDate.getMonthValue() == 03)){
////                currentDate = currentDate.plusDays(1);
////                System.out.println("LEAP YEAR");
////            }
            if(currentDate.getMonth() == pastDate.getMonth()){
                System.out.println(currentDate.getMonth() + "  =  " + pastDate.getMonth());
                System.out.println("Blue Moon = " + currentDate.getYear());
                blueMoonCounter += 1;
            }
            pastDate = pastDate.withYear(currentDate.getYear());
            pastDate = pastDate.withMonth(currentDate.getMonthValue());
            pastDate = pastDate.withDayOfMonth(currentDate.getDayOfMonth());
            pastDate = pastDate.withHour(currentDate.getHour());
            pastDate = pastDate.withMinute(currentDate.getMinute());
            pastDate = pastDate.withSecond(currentDate.getSecond());
//            System.out.println("Past Date = " + pastDate);
        }
        System.out.println(blueMoonCounter);
    }
}
