package JAVA_DSA;

public class wordsearch {

    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, int row, int col, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        int rows = board.length;
        int cols = board[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#'; // Mark as visited

        boolean found = dfs(board, row - 1, col, word, index + 1) ||
                dfs(board, row + 1, col, word, index + 1) ||
                dfs(board, row, col - 1, word, index + 1) ||
                dfs(board, row, col + 1, word, index + 1);

        board[row][col] = temp; // Restore the original character
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";
        boolean exists = exist(board, word);
        System.out.println("Does the word exist? true or false\n"+exists);
    }
}
