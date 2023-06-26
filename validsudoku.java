package JAVA_DSA;

public class validsudoku {

        public static boolean isValidSudoku(char[][] board) {
            // Check rows
            for (int i = 0; i < 9; i++) {
                boolean[] seen = new boolean[9];
                for (int j = 0; j < 9; j++) {
                    char currentVal = board[i][j];
                    if (currentVal != '.') {
                        int index = currentVal - '1';
                        if (seen[index]) {
                            return false;
                        }
                        seen[index] = true;
                    }
                }
            }

            // Check columns
            for (int j = 0; j < 9; j++) {
                boolean[] seen = new boolean[9];
                for (int i = 0; i < 9; i++) {
                    char currentVal = board[i][j];
                    if (currentVal != '.') {
                        int index = currentVal - '1';
                        if (seen[index]) {
                            return false;
                        }
                        seen[index] = true;
                    }
                }
            }

            // Check subgrids
            for (int block = 0; block < 9; block++) {
                boolean[] seen = new boolean[9];
                int rowOffset = (block / 3) * 3;
                int colOffset = (block % 3) * 3;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char currentVal = board[rowOffset + i][colOffset + j];
                        if (currentVal != '.') {
                            int index = currentVal - '1';
                            if (seen[index]) {
                                return false;
                            }
                            seen[index] = true;
                        }
                    }
                }
            }

            return true;
        }

        public static void main(String[] args) {
            char[][] board = {
                    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
            };

            boolean isValid = isValidSudoku(board);
            System.out.println("Is the Sudoku board valid? True or False\n"+isValid);
        }}

