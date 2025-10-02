import java.util.Arrays;
import java.util.Scanner;

public class Proj6_2_TicTacToe {

    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        String winner = "";
        boolean boardIsFull = false;
        String[][] myGameBoard = new String[3][3];
        initializeGameBoard(myGameBoard);
        printCurrentBoard(myGameBoard);
        String xTurn = "X";

        while (winner.isEmpty() && !boardIsFull) {
            getUserInput(xTurn, myGameBoard);
            printCurrentBoard(myGameBoard);
            winner = getWinner(myGameBoard);
            if (winner.equals(" ")) {
                winner = "";
            }
            boardIsFull = isBoardFull(myGameBoard);

            if (xTurn.equals("X")) {
                xTurn = "O";
            } else {
                xTurn = "X";
            }
        }

        if (!winner.isEmpty()) {
            System.out.println(winner + " has won the game!");
        } else {
            if (boardIsFull) {
                System.out.println("The cat has won - the board is full, so there is no winner for this game.");
            }
        }
    }

    public static void initializeGameBoard(String[][] gameBoard) {
        for (String[] strings : gameBoard) {
            Arrays.fill(strings, " ");
        }
    }

    public static void printCurrentBoard(String[][] gameBoard) {
        System.out.println();
        for (int i = 0; i < gameBoard.length; i++) {
            if (i > 0) {
                System.out.println();
            }
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(" ");
                System.out.print(gameBoard[i][j]);
                System.out.print(" ");
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                for (int d = 0; d < 6; d++) {
                    System.out.print("- ");
                }
            }
        }
        System.out.println();
    }

    public static void getUserInput(String xTurn, String[][] gameBoard) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("It is " + xTurn + "'s turn.");
        System.out.println("Please enter the row THEN the column, each from 0, 1, or 2, separated by a space.");
        String input = scanner.nextLine();

        String[] inputOptions = input.split(" ");
        int xValue = Integer.parseInt(inputOptions[0]);
        int yValue = Integer.parseInt(inputOptions[1]);

        if (xValue >= 0 && xValue <= 2) {
            if (yValue >= 0 && yValue <= 2) {
                if (cellAlreadyOccupied(xValue, yValue, gameBoard)) {
                    System.out.println("That cell is already occupied, please try again.");
                    getUserInput(xTurn, gameBoard);
                } else {
                    gameBoard[xValue][yValue] = xTurn;
                }
            } else {
                System.out.println("The column value is invalid. Please try again.");
                getUserInput(xTurn, gameBoard);
            }
        } else {
            System.out.println("The row value is invalid. Please try again.");
            getUserInput(xTurn, gameBoard);
        }
    }

    public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return !gameBoard[row][col].equals(" ");
    }

    public static String getWinner(String[][] gameBoard) {
        for (String[] strings : gameBoard) {
            int rowCount = 1;
            for (int y = 0; y < strings.length - 1; y++) {
                if (strings[y].equals(strings[y + 1])) {
                    rowCount++;
                }
            }
            if (rowCount == 3) {
                return strings[1];
            }
        }

        for (int col = 0; col < 3; col++) {
            int colCount = 1;
            for (int row = 0; row < 2; row++) {
                if (gameBoard[row][col].equals(gameBoard[row + 1][col])) {
                    colCount++;
                }
            }
            if (colCount == 3) {
                return gameBoard[0][col];
            }
        }

        int diagonalDownCount = 1;
        for (int i = 0; i < 2; i++) {
            if (gameBoard[i][i].equals(gameBoard[i + 1][i + 1])) {
                diagonalDownCount++;
            }
        }
        if (diagonalDownCount == 3) {
            return gameBoard[1][1];
        }

        int diagonalUpCount = 1;
        for (int i = 2; i > 0; i--) {
            if (gameBoard[i][i].equals(gameBoard[i - 1][i - 1])) {
                diagonalUpCount++;
            }
        }
        if (diagonalUpCount == 3) {
            return gameBoard[2][2];
        }

        return "";
    }

    public static boolean isBoardFull(String[][] gameBoard) {
        for (String[] strings : gameBoard) {
            for (String string : strings) {
                if (string.equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
}