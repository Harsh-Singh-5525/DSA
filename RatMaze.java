package JAVA_DSA;

public class RatMaze {
        public static void main(String[] args) {
            int[][] maze = {
                    {1, 0, 0, 0},
                    {1, 1, 0, 1},
                    {0, 1, 0, 0},
                    {1, 1, 1, 1}
            };

            int[][] solution = solveMaze(maze);

            if (solution != null) {
                System.out.println("Solution found:");
                printSolution(solution);
            } else {
                System.out.println("No solution exists.");
            }
        }

        public static int[][] solveMaze(int[][] maze) {
            int rows = maze.length;
            int cols = maze[0].length;
            int[][] solution = new int[rows][cols];

            if (solveMazeUtil(maze, 0, 0, solution)) {
                return solution;
            } else {
                return null;
            }
        }

        private static boolean solveMazeUtil(int[][] maze, int row, int col, int[][] solution) {
            int rows = maze.length;
            int cols = maze[0].length;

            // Check if the current position is a valid move
            if (row >= 0 && row < rows && col >= 0 && col < cols && maze[row][col] == 1) {
                // Check if we have reached the destination
                if (row == rows - 1 && col == cols - 1) {
                    solution[row][col] = 1;
                    return true;
                }

                // Mark the current position as part of the solution path
                solution[row][col] = 1;

                // Move to the right
                if (solveMazeUtil(maze, row, col + 1, solution)) {
                    return true;
                }

                // Move down
                if (solveMazeUtil(maze, row + 1, col, solution)) {
                    return true;
                }

                // Move to the left
                if (solveMazeUtil(maze, row, col - 1, solution)) {
                    return true;
                }

                // Move up
                if (solveMazeUtil(maze, row - 1, col, solution)) {
                    return true;
                }

                // If none of the moves lead to a solution, backtrack
                solution[row][col] = 0;
                return false;
            }

            return false;
        }

        public static void printSolution(int[][] solution) {
            int cols = solution[0].length;

            for (int[] ints : solution) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
        }
    }

