package bootcamp.model;

import java.util.ArrayList;
import java.util.Arrays;

public class PartTwo {
    public static void main(String[] args) {

//        int [] scenario1 = {1, -3, 5, -3, 0};
//        int [] scenario2 = {1, 2, 3};
//        int [] scenario3 = {-1, -2, -3};
//
//        System.out.println(Arrays.toString(postiveNumbers(scenario1)));
//        System.out.println(Arrays.toString(postiveNumbers(scenario2)));
//        System.out.println(Arrays.toString(postiveNumbers(scenario3)));

//        int [] scenario1 = {1, -8, 4, -3, 6, 9};
//        int [] scenario2 = {1, 2, 3, 4, 5, 6 ,7, 8};
//        int [] scenario3 = {-1, -3, 5, 7, 9, -11};
//
//        System.out.println(Arrays.toString(evenNumbers(scenario1)));
//        System.out.println(Arrays.toString(evenNumbers(scenario2)));
//        System.out.println(Arrays.toString(evenNumbers(scenario3)));

//        int [] scenario1 = {2, 4, 8};
//        int [] scenario2 = {3, 9, 6};
//
//        System.out.println(Arrays.toString(squareNumbers(scenario1)));
//        System.out.println(Arrays.toString(squareNumbers(scenario2)));

//        strMultiply("abc", 5);

        System.out.println(palindrome("abcab"));
//        System.out.println(7/2);
    }

    //    Just the positives (easy)
//    Write a static method positiveNumbers which is given an array of numbers and returns a new array containing only the
//    positive numbers within the given array.
    public static int[] postiveNumbers(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : numbers) {
            if (x >= 0) {
                list.add(x);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

//    Just the Evens (easy)
//    Write a static method EvenNumbers which is given an array of numbers and returns a new array containing only the
//    even numbers within the given array.

    public static int[] evenNumbers(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : numbers) {
            if (x % 2 == 0) {
                list.add(x);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

//    Square the Numbers (easy)
//    Write a static method squareNumbers which is given an array of numbers and returns a new array containing only
//    the square numbers within the given array.

    public static int[] squareNumbers(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : numbers) {
            list.add(x * x);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

//    Str Multiply (easy/medium)
//    Write a strMultiply static method which takes two parameters:
//    str - the string to multiply
//    times - number of times to multiply

    public static void strMultiply(String str, int times) {
        String string = "";
        for (int i = 0; i < times; i++) {
            string = string + str;
        }
        System.out.println(string);
    }

//    Palindrome (hard)
//    https://www.thoughtco.com/what-is-a-palindrome-1691560
//    Create a static method that returns true if a word is a palindrome and returns false if it is not a palindrome

    public static boolean palindrome(String word) {
        boolean isPalindrome = false;
        String[] array = word.split("");
        String[] arr = new String[array.length];

        if (array.length % 2 == 0) {
            arr = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                arr[i] = array[i];
            }
        }else if(array.length % 2 != 0){
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
            int index = array.length/2;
            System.out.println(index);
            arrayList.remove(arrayList.get(index));
            System.out.println(arrayList);

            arr = new String[arrayList.size() ];
            for (int i = 0; i < arrayList.size(); i++) {
                    arr[i] = arrayList.get(i);
            }
            System.out.println(arr.length);
            System.out.println(Arrays.toString(arr));
        }
            String[] arr1 = new String[arr.length / 2];
            String[] arr2 = new String[arr.length / 2];
            for (int i = 0; i <= arr.length / 2 - 1; i++) {
                arr1[i] = arr[i];
                arr2[i] = arr[arr.length / 2 + i];
                System.out.println(" for i = " + i + ". " + "arr1(i) = " + arr1[i] + " and arr2[i] = " + arr2[i]);
            }
            for (int i = 0; i <= arr1.length - 1; i++) {
                if (arr1[i].equals(arr2[arr1.length - 1 - i])) {
                    isPalindrome = true;
                    System.out.println("for new i = " + i + ". " + "arr1[i] = " + arr1[i] + " and arr2[i] = " + arr2[arr1.length-1-i]);
                }else{
                    isPalindrome = false;
                }
            }

        return isPalindrome;

    }



}
