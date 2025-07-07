/**
    문제 : 소수 구하기

    문제 설명
    M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
    M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

    TEST CASE
    3 16
    ->  3
        5
        7
        11
        13
**/
import java.util.Scanner;

public class Sol1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();
        int[] numList = new int[endNum + 1];

        for(int i = 1; i <= endNum; i++) {
            numList[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(endNum); i++) {
            if(numList[i] == 0) continue;
            for(int j = i + i; j <= endNum; j = j + i) {
                numList[j] = 0;
            }
        }

        for(int i = startNum; i <= endNum; i++) {
            if(numList[i] != 0) {
                System.out.println(numList[i]);
            }

        }
    }
}
