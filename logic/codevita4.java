import java.util.*;

public class codevita4 {
    static int N;
    static char[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            String row = sc.nextLine().trim();
            for (int j = 0; j < N; j++) grid[i][j] = row.charAt(j);
        }

        System.out.println(shortestPath());
    }

    static int shortestPath() {
        int[] start = findChar('S');
        int[] end = findChar('D');
        if (start == null || end == null) return -1;

        boolean[][] visited = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1], 1});
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0], c = cur[1], dist = cur[2];
            if (r == end[0] && c == end[1]) return dist;

            for (int k = 0; k < 4; k++) {
                int nr = r + dx[k];
                int nc = c + dy[k];
                if (nr >= 0 && nr < N && nc >= 0 && nc < N &&
                        !visited[nr][nc] &&
                        (grid[nr][nc] == 'T' || grid[nr][nc] == 'D')) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc, dist + 1});
                }
            }
        }
        return -1;
    }

    static int[] findChar(char ch) {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (grid[i][j] == ch) return new int[]{i, j};
        return null;
    }
}
