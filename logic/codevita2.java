import java.util.*;

public class codevita2{
    static int rows, cols, keyLength, clueCount;
    static char[][] letterGrid;
    static boolean[][][] forbiddenCells;
    static int[] moveX = {-1, 1, 0, 0}; // Up, Down, Left, Right
    static int[] moveY = {0, 0, -1, 1};
    static Set<String> possibleKeys = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rows = sc.nextInt();
        cols = sc.nextInt();
        sc.nextLine();
        letterGrid = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            String[] rowLetters = sc.nextLine().trim().split(" ");
            for (int c = 0; c < cols; c++) {
                letterGrid[r][c] = rowLetters[c].charAt(0);
            }
        }

        keyLength = sc.nextInt();
        clueCount = sc.nextInt();

        forbiddenCells = new boolean[keyLength][rows][cols];

        for (int i = 0; i < clueCount; i++) {
            int timeStep = sc.nextInt();
            int x1 = sc.nextInt() - 1;
            int y1 = sc.nextInt() - 1;
            int x2 = sc.nextInt() - 1;
            int y2 = sc.nextInt() - 1;

            for (int r = x1; r <= x2; r++) {
                for (int c = y1; c <= y2; c++) {
                    forbiddenCells[timeStep - 1][r][c] = true;
                }
            }
        }

        boolean[][] visited = new boolean[rows][cols];

        // Start DFS from all valid first letters
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (!forbiddenCells[0][r][c]) {
                    visited[r][c] = true;
                    searchKey(r, c, 1, "" + letterGrid[r][c], visited);
                    visited[r][c] = false;
                    if (possibleKeys.size() > 1) break;
                }
            }
            if (possibleKeys.size() > 1) break;
        }

        if (possibleKeys.size() == 1)
            System.out.print(possibleKeys.iterator().next());
        else
            System.out.print("Not enough clues");
    }

    // DFS with backtracking to find all valid secret keys
    static void searchKey(int row, int col, int timeStep, String currentKey, boolean[][] visited) {
        if (possibleKeys.size() > 1) return;

        if (timeStep == keyLength) {
            possibleKeys.add(currentKey);
            return;
        }

        boolean[][] forbid = forbiddenCells[timeStep];

        for (int d = 0; d < 4; d++) {
            int nextRow = row + moveX[d];
            int nextCol = col + moveY[d];

            if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols
                    && !visited[nextRow][nextCol] && !forbid[nextRow][nextCol]) {

                visited[nextRow][nextCol] = true;
                searchKey(nextRow, nextCol, timeStep + 1, currentKey + letterGrid[nextRow][nextCol], visited);
                visited[nextRow][nextCol] = false; // backtrack
            }
        }
    }
}
