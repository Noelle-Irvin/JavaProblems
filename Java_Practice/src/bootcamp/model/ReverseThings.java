package com.bootcamp;


public class ReverseThings{
    public static void main(String [] args){
//in the static method below, write logic that takes a number and reverses it
//input : an int
//output : an int
        System.out.println(reverseNum(123)); //returns 321
        System.out.println(reverseNum(1923)); //returns 3291
    }

    public static int reverseNum(int num){
//post code here
        StringBuilder builder = new StringBuilder(String.valueOf(num));
        builder.reverse();
        return Integer.parseInt(builder.toString());
    }
}

