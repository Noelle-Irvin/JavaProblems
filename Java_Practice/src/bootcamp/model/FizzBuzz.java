package com.bootcamp;

public class FizzBuzz {

    public static void main(String[] args){
        fizzBuzz();
    }
    public static void fizzBuzz() {
        for (int i = 1; i <= 60; i++) {
            String string = "";
            boolean fizzbuzz = false;
            if (i % 3 == 0) {
                string += "Fizz";
                fizzbuzz = true;
            }
            if (i % 5 == 0) {
                string += "Buzz";
                fizzbuzz = true;
            }
            if (fizzbuzz == true) {
                System.out.println(string);
            } else {
                System.out.println(i);
            }
        }
    }


    }
