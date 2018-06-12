package com.bootcamp;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String str = "Given I  visit   HomeDepot!,.com,";
        StringTokenizer strT2 = new StringTokenizer(str, "! ,.", true);
        StringBuilder build = new StringBuilder();


       while(strT2.hasMoreTokens()){
           StringBuilder wordbuild = new StringBuilder();
           String word = strT2.nextToken();
           wordbuild.append(word).reverse();
           System.out.println(word);
           build.append(wordbuild);
       }
        System.out.println(build);
    }
}
