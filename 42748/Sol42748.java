/**
    문제 - K번째 수
    배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하라.

    제한사항
    - array의 길이는 1 이상 100 이하
    - array의 각 원소는 1 이상 100 이하
    - commands의 길이는 1 이상 50 이하
    - commands의 각 원소는 길이가 3
    - commands의 각 원소는 [i, j, k] 형태
        - i는 1 이상 j 이하
        - j는 i 이상 array의 길이 이하
        - k는 1 이상 j - i + 1 이하

    입출력 예
    array = [1, 5, 2, 6, 3, 7, 4]
    commands = [
        [2, 5, 3],
        [4, 4, 1],
        [1, 7, 3]
    ]
    return = [5, 6, 3]
**/

import java.util.ArrayList;
import java.util.Arrays;

public class Sol42748 {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int[] command : commands) {
            int[] newArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(newArray);
            
            answer.add(newArray[command[2] - 1]);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Sol42748 sol = new Sol42748();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };
        sol.solution(array, commands);
    }
}
