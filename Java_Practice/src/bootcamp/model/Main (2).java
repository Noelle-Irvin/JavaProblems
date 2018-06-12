package com.bootcamp;

public class Main {

    public static void main(String[] args) {
	int[] listOfNumbers = {5,4,3,2,1};
	int[] sortedList = bubbleSot(listOfNumbers);
	for(int i = 0; i<sortedList.length; i++){
        System.out.println(sortedList[i]);
    }
    }

    public static int[] bubbleSot(int[] numbers){
        //length of the array
        int n = numbers.length;
        //Temp number for stashing on a swap
        int temp = 0;

        //loop through every number (outter)
        for(int i = 1; i <= n ; i++){
            //loop through every number (inner)
            for(int j = 0; j < n - i; j++){
                //Check the ith time through the list
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
}
