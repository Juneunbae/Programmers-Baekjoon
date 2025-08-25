/** 
    문제 : 피보나치 수열

    문제 설명
    피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
    입력은 피보나치 수열의 총 항의 수이다.
    만약 7이 입력되면, 1 1 2 3 5 8 출력된다.

    입력
    첫 줄에 총 항의 수 N(3 <= N <= 45)이다.

    출력
    첫 줄에 피보나치 수열을 출력합니다.

    TEST CASE
    7
    -> 1 1 2 3 5 8
**/
import java.util.Scanner;

public class Sol0704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i < n; i++) System.out.print(DFS(i) + " ");
    }

    public static int DFS(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return DFS(n - 1) + DFS(n - 2);
    }
}
