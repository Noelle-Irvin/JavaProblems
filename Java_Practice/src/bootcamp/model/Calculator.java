package bootcamp.model;

public class Calculator {

    private int answer;

    public void add( int number ){
        this.answer = this.answer + number;
    }

    public void subtract(int number){
        this.answer = this.answer - number;
    }

    public void multiply(int number){
        this.answer = answer * number;
    }

    public void divide(int number){
        this.answer = answer / number;
    }

    public void clear(){
        this.answer = 0;
    }

    public int getAnswer(){
        return answer;
    }
}
