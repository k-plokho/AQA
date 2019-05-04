package hometask6;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        System.out.println("  0 1 2");
        System.out.println("0 _|_|_");
        System.out.println("1 _|_|_ <-----THAT'S THE GAME TICTACTOE!!!!!");
        System.out.println("2  | | ");
        printMatrix(grid);

        while (true) {
            Scanner userInput = new Scanner(System.in);
            while (true) {
                System.out.print("USER1, please enter m#: ");
                int m1 = userInput.nextInt();
                System.out.print("USER1, please enter n#: ");
                int n1 = userInput.nextInt();
                if (grid[m1][n1] == 0) {
                    grid[m1][n1] = 1;
                    printMatrix(grid);
                    break;
                } else {
                    System.out.println("This cell is already filled! Please, choose another one!!!!!!");
                    printMatrix(grid);
                }
            }

            if (isWinner(grid, 1)) {
                System.out.println("USER1 IS THE WINNER. USER2 IS LOH AZAZAZAZA");
                break;
            }

            if (noWinnerSituation(grid)) {
                System.out.println("NO WINNERS!!!");
                break;
            }

            while (true) {
                System.out.print("USER2, please enter m#: ");
                int m2 = userInput.nextInt();
                System.out.print("USER2, please enter n#: ");
                int n2 = userInput.nextInt();
                if (grid[m2][n2] == 0) {
                    grid[m2][n2] = 2;
                    printMatrix(grid);
                    break;
                } else {
                    System.out.println("This cell is already filled! Please, choose another one!!!!!!");
                    printMatrix(grid);
                }
            }

            if (isWinner(grid, 2)) {
                System.out.println("USER2 IS THE WINNER. USER1 IS LOH AZAZAZAZA");
                break;
            }

            if (noWinnerSituation(grid)) {
                System.out.println("NO WINNERS!!!");
                break;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isWinner(int[][] grid, int user) {
        return (grid[0][0] == user && grid[0][1] == user && grid[0][2] == user)
                || (grid[1][0] == user && grid[1][1] == user && grid[1][2] == user)
                || (grid[2][0] == user && grid[2][1] == user && grid[2][2] == user)
                || (grid[0][0] == user && grid[1][0] == user && grid[2][0] == user)
                || (grid[0][1] == user && grid[1][1] == user && grid[2][1] == user)
                || (grid[0][2] == user && grid[1][2] == user && grid[2][2] == user)
                || (grid[0][0] == user && grid[1][1] == user && grid[2][2] == user)
                || (grid[0][2] == user && grid[1][1] == user && grid[2][0] == user);
    }

    public static boolean noWinnerSituation(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

