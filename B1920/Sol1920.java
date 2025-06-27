/**
    문제 : 수 찾기

    문제 설명
    N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

    입력
    첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다.
    다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
    다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다.
    다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다.
    모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.

    TEST CASE
    5
    4 1 5 2 3
    5
    1 3 7 9 5
    ->
    1
    1
    0
    0
    1
**/
import java.util.Arrays;
import java.util.Scanner;

public class Sol1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int M = sc.nextInt();
        for(int i = 0; i < M; i++) {
            boolean find = false;
            int target = sc.nextInt();
            int start = 0;
            int end = A.length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                int midValue = A[mid];

                if (midValue > target) {
                    end = mid - 1;
                } else if (midValue < target) {
                    start = mid + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) System.out.println(1);
            else System.out.println(0);
        }
    }
}
