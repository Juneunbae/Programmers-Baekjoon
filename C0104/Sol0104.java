/**
    문제 : 단어 뒤집기

    문제 설명
    N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

    입력
    첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
    두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다.
    단어는 영어 알파벳으로만 구성되어 있습니다.

    출력
    N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

    TEST CASE
    3
    good
    Time
    Big
    ->
    doog
    emiT
    giB
**/
import java.util.Scanner;

public class Sol0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordNum = sc.nextInt();
        sc.nextLine();
        String[] str = new String[wordNum];
        for(int i = 0; i < wordNum; i++) {
            str[i] = sc.nextLine();
        }
        for(String word : str) {
            StringBuilder stringBuilder = new StringBuilder(word).reverse();
            String reverseWord = stringBuilder.toString();
            System.out.println(reverseWord);
        }
    }
}
