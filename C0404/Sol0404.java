/**
    문제 : 모든 아나그램 찾기

    문제 설명
    S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
    아나그램 판별시 대소문자가 구분됩니다. 
    부분문자열은 연속된 문자열이어야 합니다.

    입력
    첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
    S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

    출력
    S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

    TEST CASE
    bacaAacba
    abc
    -> 3
**/

import java.util.HashMap;
import java.util.Scanner;

public class Sol0404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        String t = sc.nextLine();
        
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(Character c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int answer = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        for(int rt = 0; rt < t.length() - 1; rt++) {
            sMap.put(s[rt], sMap.getOrDefault(s[rt], 0) + 1);
        }

        int lt = 0;
        for(int rt = t.length() - 1; rt < s.length; rt++) {
            sMap.put(s[rt], sMap.getOrDefault(s[rt], 0) + 1);

            if(tMap.equals(sMap)) answer++;

            sMap.put(s[lt], sMap.get(s[lt]) - 1);
            if (sMap.get(s[lt]) == 0) sMap.remove(s[lt]);
            lt++;
        }

        System.out.println(answer);
    }
}
