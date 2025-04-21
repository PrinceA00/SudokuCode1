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
        // To be completed next
        return "";
    }
}
