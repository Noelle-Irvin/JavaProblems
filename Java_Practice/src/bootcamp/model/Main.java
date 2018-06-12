package bootcamp.model;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int primeNumberCount = 0;
        int number = 0;
        List<Integer> numberList = new ArrayList<>();
        int prime = 0;


        do {
            number += 1;
            if(number == 1){
                number+=1;
            }else if(number == 2){
                numberList.add(number);
                primeNumberCount+=1;
                number+=1;
            }else{
            for (Integer x : numberList) {
             if (number % x == 0) {
                    prime += 1;
                    //System.out.println("number = " + number);
                }
            }
            if (prime == 0) {
                primeNumberCount += 1;
                numberList.add(number);
                System.out.println("primeNumber = " + number);
            }}
            prime = 0;
        } while (primeNumberCount < 10001);

        System.out.println("10,001st prime number = " + number);

    }
}
