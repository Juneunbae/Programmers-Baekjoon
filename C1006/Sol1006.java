/**
    문제 : 동전교환

    문제 설명
    다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
    각 단위의 동전은 무한정 쓸 수 있다.

    입력
    첫 번째 줄에는 동전의 종류개수 N(1<=N<=50)이 주어진다.
    두 번째 줄에는 N개의 동전의 종류가 주어지고, 그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.
    각 동전의 종류는 100원을 넘지 않는다.


    출력
    첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.

    TEST CASE
    3
    1 2 5
    15
    -> 3
**/
import java.util.Arrays;
import java.util.Scanner;

public class Sol1006 {
    public static int n, m;
    public static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) coins[i] = sc.nextInt();
        m = sc.nextInt();
        dy = new int[m + 1];
        System.out.println(solution(coins));
    }

    public static int solution(int[] coins) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coins[i]] + 1);
            }
        }

        return dy[m];
    }
}
