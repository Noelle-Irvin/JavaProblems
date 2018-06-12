package com.bootcamp;

import java.util.ArrayList;

public class CubeNumbers {
    public static void main(String[] args){
        int[] scenario1 = {2, 4, 8};
        int[] scenario2 = {3, 4, 6};

        System.out.println(cubeNumbers(scenario1));
        System.out.println(cubeNumbers(scenario2));
    }
    public static ArrayList<Integer> cubeNumbers(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int x : numbers) {
            int cube = x * x * x;
            arrayList.add(cube);
        }
        return arrayList;
    }



}
