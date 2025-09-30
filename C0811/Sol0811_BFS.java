/**
    문제 : 섬나라 아일랜드(BFS)

    문제 설명
    N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
    각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
    섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.

    입력
    첫 번째 줄에 자연수 N(3<=N<=20)이 주어집니다.
    두 번째 줄부터 격자판 정보가 주어진다.

    출력
    첫 번째 줄에 섬의 개수를 출력한다.

    TEST CASE
    7
    1 1 0 0 0 1 0
    0 1 1 0 1 1 0
    0 1 0 0 0 0 0
    0 0 0 1 0 1 1
    1 1 0 1 1 0 0
    1 0 0 0 1 0 0
    1 0 1 0 1 0 0
    -> 5
**/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Sol0811_BFS {
    public static int[][] board;
    public static int n, answer = 0;
    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        solution(board);
        System.out.println(answer);
    }

    public static void solution(int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    answer++;
                    queue.offer(new Point(i, j));
                    BFS();
                }
            }
        }
    }

    public static void BFS() {
        while(!queue.isEmpty()) {
            Point tmp = queue.poll();
            board[tmp.x][tmp.y] = 0;
            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.offer(new Point(nx, ny));
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
