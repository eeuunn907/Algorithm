import java.util.*;

class Solution {
    static class Point {
        int x, y, time;
        Point(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();

        char[][] map = new char[n][m];
        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = maps[i].charAt(j);
                if (map[i][j] == 'S') {
                    start = new int[]{i, j};
                } else if (map[i][j] == 'L') {
                    lever = new int[]{i, j};
                } else if (map[i][j] == 'E') {
                    exit = new int[]{i, j};
                }
            }
        }

        int toLever = bfs(map, start, lever);
        if (toLever == -1) return -1;

        int toExit = bfs(map, lever, exit);
        if (toExit == -1) return -1;

        return toLever + toExit;
    }

    private int bfs(char[][] map, int[] start, int[] end) {
        int n = map.length;
        int m = map[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(start[0], start[1], 0));
        visited[start[0]][start[1]] = true;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            Point cur = q.poll();

            if (cur.x == end[0] && cur.y == end[1]) {
                return cur.time;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny] || map[nx][ny] == 'X') continue;

                visited[nx][ny] = true;
                q.offer(new Point(nx, ny, cur.time + 1));
            }
        }

        return -1;
    }
}