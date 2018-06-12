package com.bootcamp;

import java.util.HashMap;
import java.util.Map;

public class LetterSummary {
    public static void main(String[] args) {
        letter_histogram("banana");
    }
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
    }
