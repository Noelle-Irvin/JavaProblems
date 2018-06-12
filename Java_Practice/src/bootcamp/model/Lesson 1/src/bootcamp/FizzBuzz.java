package bootcamp;

public class FizzBuzz {
    public static void main(String[] args) {
        int x = 1;
        for (x = 1; x <= 60; x++) {
            if ((x % 3 == 0) && (x % 5 ==0)){
                System.out.println("FizzBuzz");
            }
            else if (x % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (x % 3==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(x);
            }
        }
    }
}
