package com.bootcamp;

import java.util.ArrayList;

public class OddNumbers {
    public static void main(String[] args){
        int [] scenario1 = {1, -8, 4, -3, 6, 9};
        int [] scenario2 = {1, 2, 3, 4, 5, 6 ,7, 8};
        int [] scenario3 = {-1, -3, 5, 7, 9, -11};

        System.out.println(oddNumbers(scenario1));
        System.out.println(oddNumbers(scenario2));
        System.out.println(oddNumbers(scenario3));
    }

    public static ArrayList<Integer> oddNumbers(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int x : numbers) {
            if (x % 2 != 0) {
                arrayList.add(x);
            }
        }
        return arrayList;
    }
}
