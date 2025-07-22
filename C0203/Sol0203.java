/**
    문제 : 가위 바위 보

    문제 설명
    A, B 두 사람이 가위바위보 게임을 합니다. 
    총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
    가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

    입력
    첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
    두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
    세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

    출력
    각 줄에 각 회의 승자를 출력합니다.
    비겼을 경우는 D를 출력합니다.
    
    TEST CASE
    5
    2 3 3 1 3
    1 1 2 2 3
    ->
    A
    B
    A
    B
    D
**/
import java.util.Scanner;

public class Sol0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for(int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        int[] arrB = new int[n];
        for(int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) System.out.println("D");
            else if (arrA[i] == 3 && arrB[i] == 1) System.out.println("B");
            else if (arrA[i] == 1 && arrB[i] == 3) System.out.println("A");
            else if (arrA[i] < arrB[i]) System.out.println("B");
            else System.out.println("A");
        }
    }
}
