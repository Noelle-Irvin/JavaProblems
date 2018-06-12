package com.bootcamp;

//Given a string:
//
//        In Java, create a static method that takes in a string as input returns a string where the last character of each word is capitalized
//
//        input: "today is friday"
//        output : "todaY iS fridaY"
public class number8 {

    public static void main(String[] args) {
        String input = "today is friday and tomorrow is saturday";
        System.out.println(capitalized(input));
    }
    public static String capitalized(String str){
        String [] arr = str.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(" ")){
                String temp = arr[i-1].toUpperCase();
                arr[i-1] = temp;
            }else if(i == arr.length-1){
                String temp = arr[i].toUpperCase();
                arr[i] = temp;
            }
        }
        String output = "".join("", arr);
        return output;
    }

}