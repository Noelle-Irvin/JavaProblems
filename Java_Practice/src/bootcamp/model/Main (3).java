package com.bootcamp;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.String.join;

public class Main {

    public static void main(String[] args) {
//        int [] scenario1 = {1, -8, 4, -3, 6, 9};
//        int [] scenario2 = {1, 2, 3, 4, 5, 6 ,7, 8};
//        int [] scenario3 = {-1, -3, 5, 7, 9, -11};
//
//        System.out.println(oddNumbers(scenario1));
//        System.out.println(oddNumbers(scenario2));
//        System.out.println(oddNumbers(scenario3));

//        int[] scenario1 = {2, 4, 8};
//        int[] scenario2 = {2, 9, 6};
//
//        System.out.println(cubeNumbers(scenario1));
//        System.out.println(cubeNumbers(scenario2));

//        fizzBuzz();

//        System.out.println(reverse("Thursday"));

//        letter_histogram("banana");

        decipher("Travhf jvgubhg rqhpngvba vf yvxr fvyire va gur zvar");
//        String a = "a"; // 97 through
//        String z = "z";
//        String A = "A";
//        String Z = " ";
//
//        System.out.println(a.codePointAt(0));
//        System.out.println(z.codePointAt(0));
//        System.out.println(A.codePointAt(0));
//        System.out.println(Z.codePointAt(0));
        int i = 122 - 13;
        int j = 90 - 13;
        //System.out.println("lowerCase = " + i + " and UpperCase = " + j);


        //char newChar = charValue('\u0000');
    }

//    Just the Odd Numbers
//
//    Write a method OddNumbers which is given an array of numbers in its parameters and returns a new ArrayList
//    containing only the odd numbers within the given array.

    public static ArrayList<Integer> oddNumbers(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int x : numbers) {
            if (x % 2 != 0) {
                arrayList.add(x);
            }
        }
        return arrayList;
    }


//    Cube the Numbers
//
//    Write a static method cubeNumbers which is given an array of numbers and returns a new ArrayList containing only
//    the cube numbers within the given array. Example: 2 * 2 * 2 = 8 or 8 * 8 * 8 =512


     public static ArrayList<Integer> cubeNumbers(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int x : numbers) {
            int cube = x * x * x;
            arrayList.add(cube);
        }
        return arrayList;
    }
////
////    Write a void method that when called iterates the integers from 1 to 60. For multiples of three, print "Fizz"
////    instead of 3 and for the multiples of five print "Buzz" instead of 5. For numbers which are multiples of both three
////    and five print "FizzBuzz".

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

//    Reversing a String
//    Write a static method reverse which takes in a string as a parameter and returns the string in reversed order.
//    You are not allowed to java building helpers to reverse (such as StringBuilder class or StringBuffer class)

    public static String reverse(String string) {
        String[] array = string.split("");
        List<String> arrayList = Arrays.asList(array);

        List<String> newArrayList = new ArrayList<String>();

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            newArrayList.add(arrayList.get(i));
        }

        String reverseString = "".join("", newArrayList);

        return reverseString;
    }

//    Letter Summary
//
//    Write a void static method called letter_histogram that takes a word as input, and prints a map containing a tally
//    of each letter in the alphabet was used in the word. (Hint: HashMap may help)

    public static void letter_histogram(String word) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] array = word.toCharArray();

        for (char letter : array) {
            if (map.containsKey(letter)) {
                int count = map.get(letter);
                count += 1;
                map.replace(letter, count);
            } else {
                map.put(letter, 1);
            }
        }
        System.out.println(map.toString());
    }
//count the letters between the alphabet between one character and the other, progrmatically find the offset
    //take any string using that offset, the offset is the same for all characters
    //Carl does not care about the offset, lower case, upper case matters


//    Caesar deCipher
//
//    Write a function decipher a string, and returns the original message. You must find the offset

    public static String decipher(String string){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < string.length(); i++) {
            if ((109 < string.codePointAt(i)) && (string.codePointAt(i) <= 122)) {
                int newCodePoint = string.codePointAt(i) - 13;
                arrayList.add(newCodePoint);
            }else if((77 < string.codePointAt(i)) && (string.codePointAt(i) <= 90)){
                int newCodePoint = string.codePointAt(i) - 13;
                arrayList.add(newCodePoint);
            }else if(string.codePointAt(i) == 32){
                arrayList.add(32);
            }else{
                int newCodePoint = string.codePointAt(i) + 13;
                arrayList.add(newCodePoint);
            }
        }
        int [] codePoints = new int [arrayList.size()];

        for(int i = 0; i < arrayList.size() ; i++){
            codePoints[i] = arrayList.get(i);
        }
        String newString = new String(codePoints, 0, codePoints.length);
        System.out.println(newString);
        return newString;
    }
}
