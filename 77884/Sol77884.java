/**
    문제 - 약수의 개수와 덧셈

    문제 설명
    두 정수 left와 right가 매개변수로 주어집니다. 
    left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

    제한 사항
    1 ≤ left ≤ right ≤ 1,000

    입출력 예
    left	right	result
    13	    17	    43
    24	    27	    52
**/

import java.util.ArrayList;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i < right + 1; i++) {
            ArrayList<Integer> nums = new ArrayList<>();

            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    nums.add(j);
                }
            }

            if (nums.size() % 2 == 0) {
                answer += i;
            } else {
                answer += (i * -1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(13, 17));
    }
}
