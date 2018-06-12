package com.bootcamp;
//In Java create, a static method that :
//        returns true if something is a palindrome
//        returns false if something is not a palindrome
//
//        Example 1:
//        input : "racecar"
//        output : true
//
//        Example 2:
//        input : "ballon"
//        output : false
//
//        Example 1:
//        input : "Level"
//        output : true
public class number9 {

    public static void main(String[] args) {
        String input = "Leveh";
        System.out.println(palindrome(input));

    }
    public static Boolean palindrome(String input){
        String lowerCase = input.toLowerCase();
        StringBuffer reverse = new StringBuffer(lowerCase);
        reverse.reverse();
        String comparison = reverse.toString();
        if(lowerCase.equals(comparison)){
            return true;
        }else{
            return false;
        }
    }
}
