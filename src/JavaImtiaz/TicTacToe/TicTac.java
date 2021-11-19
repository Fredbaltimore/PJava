package JavaImtiaz.TicTacToe;
import java.util.*;
public class TicTac {
    private static String yourTurn;
    private static String[] ticTacToeBoard;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ticTacToeBoard = new String[9];
        yourTurn = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            ticTacToeBoard[a] = String.valueOf(a + 1);
        }

        System.out.println("☆꧁✬◦°˚°◦.██▓▒\u00AD░⡷⠂\uD835\uDE83\uD835\uDE92\uD835\uDE8C \uD835\uDE83\uD835\uDE8A\uD835\uDE8C \uD835\uDE83\uD835\uDE98\uD835\uDE8E \uD835\uDE76\uD835\uDE8A\uD835\uDE96\uD835\uDE8E⠐⢾░▒▓██.◦°˚°◦✬꧂☆ \n");
        gameBoard();

        System.out.println(
                "X goes first. Enter a number to place the X at:");

        while (winner == null) {
            int numInput;

            // Exception handling.
            // numInput will take input from user like from 1 to 9.
            // If it is not in range from 1 to 9.
            // then it will show you an error "Invalid input."
            try {
                numInput = userInput.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input; re-enter slot number:");
                continue;
            }

            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (ticTacToeBoard[numInput - 1].equals(
                    String.valueOf(numInput))) {
                ticTacToeBoard[numInput - 1] = yourTurn;
                if (yourTurn.equals("X")) {
                    yourTurn = "O";
                }
                else {
                    yourTurn = "X";
                }

                gameBoard();
                winner = winner();
            }
            else {
                System.out.println(
                        "Slot already taken; re-enter slot number:");
            }
        }

        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw! Thanks for playing.");
        }

        // For winner -to display Congratulations! message.
        else {
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");
        }
    }

    static String winner(){
        for (int i = 0; i < 8 ; i++) {
            String row = switch (i) {
                case 0 -> ticTacToeBoard[0] + ticTacToeBoard[1] + ticTacToeBoard[2];
                case 1 -> ticTacToeBoard[3] + ticTacToeBoard[4] + ticTacToeBoard[5];
                case 2 -> ticTacToeBoard[6] + ticTacToeBoard[7] + ticTacToeBoard[8];
                case 3 -> ticTacToeBoard[0] + ticTacToeBoard[3] + ticTacToeBoard[6];
                case 4 -> ticTacToeBoard[1] + ticTacToeBoard[4] + ticTacToeBoard[7];
                case 5 -> ticTacToeBoard[2] + ticTacToeBoard[5] + ticTacToeBoard[8];
                case 6 -> ticTacToeBoard[0] + ticTacToeBoard[4] + ticTacToeBoard[8];
                case 7 -> ticTacToeBoard[2] + ticTacToeBoard[4] + ticTacToeBoard[6];
                default -> null;
            };
            if (row.equals("XXX")){
                return "X";
            }else if (row.equals("OOO")){
                return "O";
            }
        }
        for (int j = 0; j < 9; j++) {
            if (Arrays.asList(ticTacToeBoard).contains(
                    String.valueOf(j + 1))) {
                break;
            }
            else if (j == 8) {
                return "draw";
            }
        }

        // To enter the X Or O at the exact place on board.
        System.out.println(
                yourTurn + "'s turn; enter a slot number to place "
                        + yourTurn + " in:");
        return null;
    }
    static void gameBoard(){
        System.out.println("" + ticTacToeBoard[0] + " | "
                + ticTacToeBoard[1] + " | " + ticTacToeBoard[2]
                + "");
        System.out.println("-----------");
        System.out.println("" + ticTacToeBoard[3] + " | "
                +ticTacToeBoard[4] + " | " + ticTacToeBoard[5]
                + "");
        System.out.println("-----------");
        System.out.println("" + ticTacToeBoard[6] + " | "
                + ticTacToeBoard[7] + " | " + ticTacToeBoard[8]
                + "");


    }
}
