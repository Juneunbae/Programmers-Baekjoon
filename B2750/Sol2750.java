/**
    문제 : 수 정렬하기

    문제 설명
    N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

    입력
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
    둘째 줄부터 N개의 줄에는 수가 주어진다. 
    이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 
    수는 중복되지 않는다.

    TEST CASE
    5
    5
    2
    3
    4
    1
    ->  1
        2
        3
        4
        5
**/

import java.util.Scanner;

public class Sol2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();    
        }

        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < N - 1 - i; j++) {
                if(A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}
