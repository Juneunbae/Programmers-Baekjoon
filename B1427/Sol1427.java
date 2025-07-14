/**
    문제 : 소트인사이드

    문제 설명
    배열을 정렬하는 것은 쉽다. 
    수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

    입력
    첫째 줄에 정렬하려고 하는 수 N이 주어진다. 
    N은 1,000,000,000보다 작거나 같은 자연수이다.

    TEST CASE
    2143
    -> 4321
**/
import java.util.Scanner;

public class Sol1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int A[] = new int[str.length()];

        for(int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        // 선택 정렬
        for(int i = 0; i < str.length(); i++) {
            int Max = i;
            for(int j = i + 1; j < str.length(); j++) {
                if(A[j] > A[Max]) {
                    Max = j;
                }
            }

            if(A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }

        for(int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }
    }
}
