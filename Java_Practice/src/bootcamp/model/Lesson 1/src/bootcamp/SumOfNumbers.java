package bootcamp;

public class SumOfNumbers {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
       do {

           sum = sum + i;

           i = i + 1;

       } while ( i <=100);
        System.out.println(sum);

    }
}
