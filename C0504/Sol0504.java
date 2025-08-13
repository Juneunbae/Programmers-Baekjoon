/**
    문제 : 후위식 연산(postfix)

    문제 설명
    후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
    만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

    입력
    첫 줄에 후위연산식이 주어집니다.
    연산식의 길이는 50을 넘지 않습니다.
    식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

    출력
    연산한 결과를 출력합니다.

    TEST CASE
    352+*9-
    -> 12
**/
import java.util.Scanner;
import java.util.Stack;

public class Sol0504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String postFix = sc.nextLine();

        Stack<Integer> stack = new Stack<>();
        for (char c : postFix.toCharArray()) {
            if (Character.isDigit(c)) stack.push(Integer.valueOf(c) - 48);
            else {
                int first = stack.pop();
                int second = stack.pop();
                
                if (c == '+') stack.push(second + first);
                else if (c == '-') stack.push(second - first);
                else if (c == '*') stack.push(second * first);
                else stack.push(second / first);
            }
        }
        
        System.out.println(stack.pop());
    }
}
