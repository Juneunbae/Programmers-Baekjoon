/**
    문제 : 조합의 경우의 수

    문제 설명
    다음 공식을 사용하여 재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.
    nCr = (n-1)C(r-1) + (n-1)C(r)

    입력
    첫째 줄에 자연수 n(3<=n<=33)과 r(0<=r<=n)이 입력됩니다.

    출력
    첫째 줄에 조합수를 출력합니다.

    TEST CASE
    5 3
    -> 10
    
    33 19
    -> 818809200
**/
import java.util.Scanner;

public class Sol0806 {
    public static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        arr = new int[n + 1][r + 1];
        System.out.println(DFS(n, r));
    }

    public static int DFS(int n, int r) {
        if (arr[n][r] > 0) return arr[n][r];
        if (n == r || r == 0) return 1;
        else return arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }
}
