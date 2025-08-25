/**
    문제 : 팩토리얼

    문제 설명
    자연수 N이 입력되면 N!를 구하는 프로그램을 작성하시오.
    예를 들어, 5!은 5 * 4 * 3 * 2 * 1 = 120 입니다.

    입력
    첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어집니다.

    출력
    첫 번째 줄에 N! 값을 출력합니다.

    TEST CASE
    5
    -> 120
**/
import java.util.Scanner;

public class Sol0703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(DFS(n));
    }
    
    public static int DFS(int n) {
        if (n == 0) return 1;
        else {
           return (n * DFS(n - 1));
        }
    }
}
