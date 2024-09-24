package ModuleProblems;

import java.util.Scanner;
import java.util.Random;

public class ShipBattle {
    public static void main(String[] args) {
        char[][] field = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = '-';
            }
        }

        Random random = new Random();
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {
            int row = getValidInput(scanner, "Enter row (1-5): ") - 1;
            int col = getValidInput(scanner, "Enter column (1-5): ") - 1;

            if (field[row][col] == '*') {
                System.out.println("You have already shot here. Try again.");
                continue;
            }

            if (row == targetRow && col == targetCol) {
                field[row][col] = 'x';
                gameOver = true;
                System.out.println("You have won!");
            } else {
                field[row][col] = '*';
            }

            printField(field);
        }

        scanner.close();
    }

    private static int getValidInput(Scanner scanner, String prompt) {
        int input = -1;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= 5) {
                    break;
                } else {
                    System.out.println("Input must be between 1 and 5. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return input;
    }

    private static void printField(char[][] field) {
        System.out.println("  0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
