package bootcamp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumNumbers {


//    Sum the numbers
//    Write a static method called sumNumbers that takes an array as a parameter and it returns an int of the sum of the numbers.
//> sumNumbers([1, 4, 8]) = 13

    public static void main(String[] args) {
//        int [] array = {1,4,8};
//        int sum = sumNumbers(array);
//        System.out.println(sum);
//
//        int [] products = {3, 4, 5};
//        int product = product(products);
//        System.out.println(product);
//
//        System.out.println(factorial(5));
//        System.out.println(factorial(10));
//
//        ArrayList<Integer> list = filtering();
//        ArrayList<Integer> newList = filtered(list);
//        System.out.println(newList);
//
//        printSquare(3);
//
//        String [] stringArray = {"National", "Aeronautics", "Space", "Administration"};
//        System.out.println(acronym(stringArray));

//        String [] string = {"O", "O", "O"};
//        System.out.println(threeInARow(string));

        String hello = "hello";
        System.out.println(alphabetSoup(hello));

    }

    public static int sumNumbers(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum;
    }

    //    Product
//    Write a static method called product that takes an array of numbers and returns the product of the numbers.
//            > product([3, 4, 5]) = 60
    public static int product(int[] product) {
        int multiply = 1;
        for (int x : product) {
            multiply = multiply * x;
        }
        return multiply;

    }


//    Find the factorial !
//    Write a static method called factorial that takes a number and returns the factorial result of that number
//    5! is 5 factorial
//    5! = 5 x 4 x 3 x 2 x 1 = 120
//            10! = 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1 = 3,628,800
//    What is factorial? : https://www.mathsisfun.com/numbers/factorial.html

    public static int factorial(int number) {
        int factorial = number;
        for (int i = 1; i < number; i++) {
            factorial = factorial * (number - i);
        }
        return factorial;
    }

//    Filtering
//    First, create a static method that returns an ArrayList of ints from 1 to 1000
//    Second, using that ArrayList, create another static method that takes in that arraylist
// as a parameter and returns a new Arraylist of numbers that does not contain multiples of 2, 3 or 5. DON’T USE .filter
//    for example for numbers from 1 to 30, I should get a final arraylist (1, 7, 11, 17, 13, 19, 23, 29).


    public static ArrayList<Integer> filtering() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }
        return list;
    }

    public static ArrayList<Integer> filtered(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer x : list) {
            if (x % 2 == 0) {
            } else if (x % 3 == 0) {
            } else if (x % 5 == 0) {
            } else {
                newList.add(x);
            }
        }
        return newList;
    }

//    Print a Square
//    Write a static method called printSquare  where when is given a size as a parameter, it prints a square of that size using asterisks.
//     > printSquare(5)
//        *****
//        *****
//        *****
//        *****
//        *****

    public static void printSquare(int number) {

        for (int i = 0; i < number; i++) {
            String string = "";
            for (int j = 0; j < number; j++) {
                string += "*";
            }
            System.out.println(string);
        }

    }

//    Acronym
//    Write a static method called acronym that takes an array of words as argument and returns the acronym of the words.
//            > acronym(['very', 'important', 'person'])
//'VIP'
//        > acronym(['national', 'aeronautics', 'space', 'administration'])
//'NASA'

    public static String acronym(String[] array) {
        String string = "";
        for (String x : array) {
            string += x.charAt(0);
        }
        return string;
    }

//    ThreeInARow
//    Write a function ThreeInARow which takes an array of size 3. Each cell in the array can be one of 'O', 'X', or null.
//    If you have three "X" in row, it should return X
//    if you have "O" in a row, it should return O
//    anything that is not a three in a row should return "none"

    public static String threeInARow(String[] array) {
        String result;

        if ((array[0] == array[1]) && (array[1] == array[2])) {
            result = array[0];
        } else {
            result = "null";
        }
        return result;
    }

//    Alphabetical Order Sorting
//    Create a static method AlphabetSoup that takes in a string parameter being passed and returns the string with the
//    letters in alphabetical order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be included
//    in the string. DO NOT USE method sort from the collections class.

    //use compareTo()

    public static String alphabetSoup(String string) {
        String[] list = string.split("");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(list));

        for (int k = 0; k < arrayList.size() - 1; k++) {
            for (int i = 0; i < arrayList.size() - k - 1; i++) {
                if ((arrayList.get(i).compareTo(arrayList.get(i + 1))) > 0) {
                    Collections.swap(arrayList, i, i + 1);
                }
            }
        }

        String alphabeticalString = "".join("", arrayList);
        return alphabeticalString;

    }
}
