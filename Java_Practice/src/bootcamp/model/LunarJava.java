package com.bootcamp;

import java.util.GregorianCalendar;

public class LunarJava {

    public static void main(String[] args){
        int blueMoonCount = numberOfBlueMoon(2000, 0, 1, 0, 0, 2999);
        System.out.println(blueMoonCount);
    }

    public static int numberOfBlueMoon(int startYear, int startMonth, int startDay, int startHour, int startMinute, int endYear){
        int blueMoonCount = 0;
        GregorianCalendar calendar = new GregorianCalendar();
        //we created a gregorian object, now set a date.
        //for the date, use our function params
        calendar.set(startYear, startMonth,startDay,startHour,startMinute);
        //start a while loop as long as the year of the current date we are onm is less than our endYear
        while(calendar.get(GregorianCalendar.YEAR) <= endYear){
            int prevMonth = calendar.get(GregorianCalendar.MONTH);
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 29);
            calendar.add(GregorianCalendar.HOUR, 12);
            calendar.add(GregorianCalendar.MINUTE, 44);
            //So, out new calendar date is the date of the next full moon. Check to see if this new date has the same month as prevMonth
            if(prevMonth == calendar.get(GregorianCalendar.MONTH)){
                blueMoonCount++;
            }
        }

        return  blueMoonCount;
    }
}
