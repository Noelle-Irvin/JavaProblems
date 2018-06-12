package bootcamp.model;

public class TicTacToe {
//    Tic Tac Toe
//    Write a static method ticTacToe which takes a two-dimensional array of size 3x3.
//   Each cell in the two dimensional array can be one of 'O', 'X', or null. The ticTacToe method will determine the winner by
//    returning 'O' if O makes a row
//    returning 'X' if X makes a row
//    return none if neither makes a row

    public static void main(String[] args){

        String [][] scenario1 = new String[][] { {"O", "O", "O"},
                {"X", " ", "X"},
                {" " , "X", " "}
        };
        String [][] scenario2 = new String[][] { {"O", "X", "O"},
                {"O", "X", " "},
                {" " ,"X" ," "}
        };
        String [][] scenario3 = new String[][] { {"O", "X", "O"},
                { "O", "O", " "},
                {" ","X","X"}
        };

        System.out.println(ticTacToe(scenario1));
        System.out.println(ticTacToe(scenario2));
        System.out.println(ticTacToe(scenario3));


    }

    public static String ticTacToe(String [][] board){
        boolean inARow;
        String variable;

        if((board[0][0].equals(board[0][1])) && (board[0][1].equals(board[0][2]))){
            inARow = true;
            variable = board[0][0];
        }else  if((board[1][0].equals(board[1][1])) && (board[1][1].equals(board[1][2]))){
            inARow = true;
            variable = board[1][0];
        }else  if((board[2][0].equals(board[2][1])) && (board[2][1].equals(board[2][2]))){
            inARow = true;
            variable = board[2][0];
        }else  if((board[0][0].equals(board[1][0])) && (board[1][0] == board[2][0])) {
            inARow = true;
            variable = board[0][0];
        }else  if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1])) {
            inARow = true;
            variable = board[0][1];
        }else  if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2])) {
            inARow = true;
            variable = board[0][1];
        }else  if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2])) {
            inARow = true;
            variable = board[0][0];
        }else  if((board[2][0] == board[1][1]) && (board[1][1] == board[0][2])) {
            inARow = true;
            variable = board[2][0];
        }else{
            variable = "none";
        }
        return variable;
    }
}
