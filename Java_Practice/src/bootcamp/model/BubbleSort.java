package bootcamp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(12);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(11);
        list.add(1);

        int flag = 0;
        int n = list.size();
        System.out.println(n);
    // for loop to iterate number of items in array
    //for loop to swap
        System.out.println(list);

        for(int k = 1; k <= n - 1; k++ ){
            System.out.println("in the k loop");

            for(int i = 0; i <= n - k - 1; i++){
                System.out.println("in the i loop");

                if(list.get(i) > list.get(i + 1)){
                    Collections.swap(list, i , i +1);

                    flag = 1;
                }
                          }
            if(flag == 0) {
                break;
            }
        }

        System.out.println(list);

    }
}
