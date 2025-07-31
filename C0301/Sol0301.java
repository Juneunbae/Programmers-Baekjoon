/**
    문제 : 두 배열 합치기

    문제 설명
    오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

    입력
    첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
    두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
    세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
    네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
    각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

    출력
    오름차순으로 정렬된 배열을 출력합니다.

    TEST CASE
    3
    1 3 5
    5
    2 3 6 7 9
    -> 1 2 3 3 5 6 7 9
**/
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Sol0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];
        for(int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrM = new int[m];
        for(int i = 0; i < m; i++) {
            arrM[i] = sc.nextInt();
        }

        int[] answer = IntStream.concat(Arrays.stream(arrN), Arrays.stream(arrM)).toArray();
        Arrays.sort(answer);
        
        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
