package bootcamp;

public class FizzBuzzChallenge {
    public static void main(String[] args) {

        for (int x = 1; x <= 60; x++) {
            String fizzbuzz = "";

            if (x % 3 == 0) {
                fizzbuzz += "Fizz";
                         }
            if (x % 5==0){
                fizzbuzz += "Buzz";
                }
            fizzbuzz = fizzbuzz == "" ? String.valueOf(x):fizzbuzz;
                System.out.println(fizzbuzz);
            }

        }
    }

