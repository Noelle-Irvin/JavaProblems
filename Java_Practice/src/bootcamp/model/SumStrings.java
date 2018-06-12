package com.bootcamp;

public class SumStrings {
    public static void main(String[] args) {
        String numbersString1 = "12378923254";
        String numbersString2 = "53625484376";
        String numbersString3 = "71941648682";

        String[] arrayOfStrings = {numbersString1,numbersString2,numbersString3};

        System.out.println(sumStrings(arrayOfStrings));
    }

    public static int sumStrings(String[] arrayOfStrings){
        int sum = 0;
        for(String stringOfNumbers: arrayOfStrings){
            int stringSum = 0;
            String[] stringArray = stringOfNumbers.split("");
            for(int i = 0; i < stringArray.length; i++){
                stringSum += Integer.parseInt(stringArray[i]);
            }
            sum += stringSum;
        }
        return sum;
    }
}
