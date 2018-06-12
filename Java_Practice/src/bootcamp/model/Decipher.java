package com.bootcamp;

import java.util.ArrayList;

public class Decipher {

    public static void main(String[] args) {

        decipher("Travhf jvgubhg rqhpngvba vf yvxr fvyire va gur zvar");
    }

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
