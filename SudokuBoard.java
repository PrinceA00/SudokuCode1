import java.io.*;
import java.util.Scanner;

public class SudokuBoard {
    private char[][] board;

    public SudokuBoard(String filename) {
        board = new char[9][9];
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            for (int row = 0; row < 9; row++) {
                String line = fileScanner.nextLine().trim();
                for (int col = 0; col < 9; col++) {
                    board[row][col] = line.charAt(col);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }
    }

   public String toString() {
    StringBuilder result = new StringBuilder();

    for (int row = 0; row < 9; row++) {
        if (row % 3 == 0 && row != 0)
            result.append("------+-------+------\n");

        for (int col = 0; col < 9; col++) {
            if (col % 3 == 0 && col != 0)
                result.append("| ");

            result.append(board[row][col] == '.' ? ". " : board[row][col] + " ");
        }
        result.append("\n");
    }

    return result.toString();
   }
    
}
