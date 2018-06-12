package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finalNumber = 20;
        int count = 0;

        while(number <= finalNumber) {
            number ++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if (count ==5){
                break;
            }

        }
        System.out.println("Total even numbers = " + count);


    }
    public static boolean isEvenNumber (int number){
    if(number % 2 == 0){
        return true;
    }else {
        return false;
    }
    }
}


