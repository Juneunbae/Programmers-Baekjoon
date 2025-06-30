/**
    문제 : 동전 0

    문제 설명
    준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
    동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 N과 K가 주어진다. 
    (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

    둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. 
    (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

    TEST CASE
    10 4200
    1
    5
    10
    50
    100
    500
    1000
    5000
    10000
    50000
    -> 6

    10 4790
    1
    5
    10
    50
    100
    500
    1000
    5000
    10000
    50000
    -> 12
**/
import java.util.Scanner;

public class Sol11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동전 개수
        int K = sc.nextInt(); // 목표 금액
        int A[] = new int[N]; // 동전 배열
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = N - 1; i >= 0; i--) {
            if (A[i] <= K) {
                count += (K / A[i]);
                K = K % A[i];
            }
        }

        System.out.println(count);
    }
}
