/**
    문제 : 잃어버린 괄호

    문제 설명
    세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 
    그리고 나서 세준이는 괄호를 모두 지웠다.
    그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
    괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.

    입력
    첫째 줄에 식이 주어진다. 
    식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다. 
    그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다. 
    수는 0으로 시작할 수 있다. 
    입력으로 주어지는 식의 길이는 50보다 작거나 같다.

    TEST CASE
    55-50+40
    -> -35

    10+20+30+40
    -> 100

    00009-00009
    -> 0
**/
import java.util.Scanner;

public class Sol1541 {
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String[] str = example.split("-");

        for(int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0) answer += temp;
            else answer -= temp;
        }

        System.out.println(answer);
    }

    private static int mySum(String string) {
        int sum = 0;
        String[] str = string.split("+");
        for(int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }

        return sum;
    }
}
