/** 
    문제 : 미로의 최단거리 통로

    문제 설명
    7*7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 작성하세요.
    경로의 길이는 출발점에서 도착점까지 가는데 이동한 횟수를 의미한다.
    출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 도로이다.
    격자판의 움직임은 상하좌우로만 움직인다.

    입력
    첫 번째 줄부터 7*7 격자의 정보가 주어집니다.

    출력
    첫 번째 줄에 최단으로 움직인 칸의 수를 출력한다. 도착할 수 없으면 -1를 출력한다.

    TEST CASE
    0 0 0 0 0 0 0
    0 1 1 1 1 1 0
    0 0 0 1 0 0 0
    1 1 0 1 0 1 1
    1 1 0 1 0 0 0
    1 0 0 0 1 0 0
    1 0 1 0 0 0 0
    -> 12
**/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Sol0809 {
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};
    public static int answer = 0;
    public static int[][] board, dis;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        BFS(1, 1);
        if (dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }

    public static void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        while(!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
}

class Point {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
