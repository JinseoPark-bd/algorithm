package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex_2206 {

    static int N, M, result;
    static int[][] arr, visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][M + 1];
        visited = new int[N + 1][M + 1];

        for (int i = 1; i < N+1; i++) {
            String str = br.readLine(); // 한줄씩 입력받음
            for (int j = 1; j < M + 1; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j - 1)));
                visited[i][j] = Integer.MAX_VALUE;
            }
        }
        result = getRoute(1, 1);
        System.out.println(result);
    }

    private static int getRoute(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y, 1, 0));
        visited[x][y] = 0;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            //현위치가 도착지점일 경우
            if (point.x == N && point.y == M) {
                return point.count;
            }

            for (int i = 0; i < 4; i++) {
                int nowX = point.x + dx[i];
                int nowY = point.y + dy[i];

                //맵 안에 있는지
                if (nowX > 0 && nowY > 0 && nowX < N + 1 && nowY < M + 1) {
                    //방문했는지 안했는지
                    if (visited[nowX][nowY] > point.drill) {
                        //벽이 있는지 없는지
                        if (arr[nowX][nowY] == 0) {
                            queue.offer(new Point(nowX, nowY, point.count + 1, point.drill));
                            visited[nowX][nowY] = point.drill;
                        } else {
                            //벽이 있으면 뚫을 수 있는지 없는지
                            if (point.drill == 0) {
                                queue.offer(new Point(nowX, nowY, point.count + 1, point.drill + 1));
                                visited[nowX][nowY] = point.drill + 1;
                            }
                        }
                    }
                }
            }
        }
        //경로가 없는 경우 -1
        return -1;
    }

    static class Point {
        int x,y,count, drill;

        public Point(int x, int y, int count, int drill) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.drill = drill;
        }
    }
}
