package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", highScore);

            highScore = calculateHighScorePosition(900);
            displayHighScorePosition("Mitch", highScore);

            highScore = calculateHighScorePosition(400);
            displayHighScorePosition("Drew", highScore);

            highScore = calculateHighScorePosition(50);
            displayHighScorePosition("Steve", highScore);

    }
    public static void displayHighScorePosition (String playerName, int highScore){
        System.out.println( playerName + " managed to get into position " + highScore + " on the high score table.");
    }
    public static int calculateHighScorePosition (int score){
        if(score > 1000)
            return 1;
        else if ( score > 500 && score < 1000)
            return 2;
        else if ( score >100 && score < 500)
            return 3;
        else
            return 4;
    }

}
