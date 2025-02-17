/**
    문제 - 핸드폰 번호 가리기

    문제 설명
    프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때
    고객들의 전화번호의 일부를 가립니다.
    전화번호가 문자열 phone_number로 주어졌을 때,
    전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린
    문자열을 리턴하는 함수, solution을 완성해주세요.

    제한 조건
    s는 길이 4 이상, 20이하인 문자열입니다.

    입출력 예
    phone_number	return
    "01033334444"	"*******4444"
    "027778888"	    "*****8888"
**/

public class Sol12948 {
    public String solution (String phone_number) {
        // phone_number의 길이를 구한다.
        int length = phone_number.length();

        // phone_number의 뒷 4자리를 제외한 나머지 길이를 구한 후 * 로 채운다.
        String front = "*".repeat(length - 4);

        // phone_number의 뒷 4자리를 구한다.
        String back = phone_number.substring(length - 4, length);
        
        return front + back;
    }

    public static void main(String[] args) {
        Sol12948 sol = new Sol12948();
        System.out.println(sol.solution("01033334444")); // *******4444
        System.out.println(sol.solution("027778888")); // *****8888
    }
}
