/**
    문제 : 특정 문자 뒤집기

    문제 설명
    영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

    입력
    첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

    출력
    첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

    TEST CASE
    a#b!GE*T@S
    -> S#T!EG*b@a
**/
import java.util.Scanner;

public class Sol0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String answer;
        
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);
        System.out.println(answer);
    }
}
