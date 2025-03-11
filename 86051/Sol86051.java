/** 
    문제 : 없는 숫자 더하기

    문제 설명
    0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다.
    numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ numbers의 길이 ≤ 9
    0 ≤ numbers의 모든 수 ≤ 9
    numbers의 모든 수는 서로 다릅니다.

    입출력 예
    numbers	            result
    [1,2,3,4,6,7,8,0]	  14
    [5,8,4,0,6,7,9]	    6
**/

import java.util.ArrayList;
import java.util.Arrays;

class Sol86051 {
    public int solution(int[] numbers) {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        
        int answer = 45;

        for (int num : numbers) {
            if (numList.contains(num)) {
                answer -= num;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sol86051 sol = new Sol86051();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(sol.solution(numbers)); // 14
    }
}
