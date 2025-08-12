/**
    문제 : 괄호 문자 제거

    문제 설명
    입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

    입력
    첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

    출력
    남은 문자만 출력한다.

    TEST CASE
    (A(BC)D)EF(G(H)(IJ)K)LM(N)
    -> EFLM
**/
import java.util.Scanner;
import java.util.Stack;

public class Sol0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        String answer = "";

        int cnt = 0;
        Stack<Character> stack = new Stack<>();

        for(char c : k.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                cnt ++;
            } else if (c == ')') {
                stack.pop();
                cnt --;
            } else if (cnt == 0) {
                answer += c;
            }
        }

        System.out.println(answer);
    }
}
