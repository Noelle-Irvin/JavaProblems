package com.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("Thursday"));
    }

    public static String reverse(String string) {
        String[] array = string.split("");
        List<String> newArrayList = new ArrayList<String>();

        for (int i = array.length - 1; i >= 0; i--) {
            newArrayList.add(array[i]);
        }

        String reverseString = "".join("", newArrayList);
        return reverseString;
    }

    }
