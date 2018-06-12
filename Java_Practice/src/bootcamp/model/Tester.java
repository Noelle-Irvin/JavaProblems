package bootcamp.model;

public class Tester {

    public static void main(String [] args){
        Calculator calc = new Calculator();


        calc.add(750);
        calc.subtract(420);
        calc.multiply(13);
        calc.divide(30);
        System.out.println(calc.getAnswer());

        calc.clear();
        calc.add(1000);
        System.out.println(calc.getAnswer());
    }
}
