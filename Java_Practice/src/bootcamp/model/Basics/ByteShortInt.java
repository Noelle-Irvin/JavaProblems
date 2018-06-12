package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValue = (50_000L + 10L * (myByteValue + myShortValue + myIntValue));
        short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));
        System.out.println("myLongValue = " + myLongValue);
        System.out.println("myLongValue = " + shortTotal);

    }
}
