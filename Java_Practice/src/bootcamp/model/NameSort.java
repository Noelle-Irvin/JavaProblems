package com.bootcamp;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NameSort {

    public static void main(String[] args) {

        try {
            HashMap<Character, Integer> alphabetCode = createAlphabetHashMap();
            System.out.println(alphabetCode);
            ArrayList<String> arrayListOfNames = readFile("../names.txt");
            Collections.sort(arrayListOfNames);
            System.out.println(arrayListOfNames);
            HashMap<String, Integer> mapOfNameValues = assignValuesToNames(alphabetCode, arrayListOfNames);
            System.out.println(mapOfNameValues);

            System.out.println(sortHashMap(mapOfNameValues));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> readFile(String fileName) throws IOException{
            BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
            String[] strArr = inputStream.readLine().split(",");
            ArrayList<String> arrayListOfNames = new ArrayList<String>(Arrays.asList(strArr));
            return arrayListOfNames;
    }

    public static HashMap<Character, Integer> createAlphabetHashMap(){
        int i = 1;
        HashMap<Character, Integer> alphabetCode = new HashMap<>();
        for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++){
            alphabetCode.put(alphabet,i++);
        }
        return alphabetCode;
    }

    public static HashMap<String, Integer> assignValuesToNames (HashMap<Character,Integer> alphabetCode, ArrayList<String> arrayListOfNames){
        HashMap<String, Integer> mapOfNameValues = new HashMap<>();
        for(int i = 0; i < arrayListOfNames.size(); i++){
            int nameValue = 0;
            char[] name = arrayListOfNames.get(i).toCharArray(); // [A, A, R, O, N] [0,1,2,3,4]
            for(int j = 0; j < name.length; j++){
                try {
                    nameValue += alphabetCode.get(name[j]);
                }catch (Exception e) {

                }
            }
            mapOfNameValues.put(arrayListOfNames.get(i), nameValue);
        }
        return mapOfNameValues;
    }

    public static LinkedHashMap<String, Integer> sortHashMap(HashMap<String, Integer> mapOfNameValue){
        LinkedHashMap<String,Integer> sortedHashMap = new LinkedHashMap<>();

        List<Integer> mapValues = new ArrayList<Integer> (mapOfNameValue.values());
        List<String> mapKeys = new ArrayList<> (mapOfNameValue.keySet());
         Collections.sort(mapValues);
         Collections.sort(mapKeys);

        for(Integer x : mapValues){
            for(int i = 0; i < mapKeys.size(); i++){
                if(mapOfNameValue.get(mapKeys.get(i)) == x){
                    sortedHashMap.put(mapKeys.get(i), x);
                    mapKeys.remove(mapKeys.indexOf(mapKeys.get(i)));
                }
            }
        }
        return sortedHashMap;
    }
}
