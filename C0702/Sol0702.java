/**
    문제 : 이진수 출력(재귀)

    문제 설명
    10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하시오.
    단 재귀함수를 사용하여 출력해야합니다.

    입력 설명
    첫 번째 줄에 10진수 N(1 <= N <= 100)이 주어집니다.

    출력 설명
    첫 번째 줄에 이진수를 출력하시오.

    TEST CASE
    11
    -> 1011
**/
import java.util.Scanner;

public class Sol0702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DFS(n);
    }

    public static void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }
}
