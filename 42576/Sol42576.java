/**
    문제 - 완주하지 못한 선수

    수많은 마라톤 선수들이 마라톤에 참여하였습니다.
    단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

    제한사항
    - 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    - completion의 길이는 participant의 길이보다 1 작습니다.
    - 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    - 참가자 중에는 동명이인이 있을 수 있습니다.
    
    입출력 예
    participant	                                            completion	                                  return
    ["leo", "kiki", "eden"]	                                ["eden", "kiki"]	                          "leo"
    ["marina", "josipa", "nikola", "vinko", "filipa"]	    ["josipa", "filipa", "marina", "nikola"]	  "vinko"
    ["mislav", "stanko", "mislav", "ana"]	                ["stanko", "ana", "mislav"]	                  "mislav"
**/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Sol42576 {
    public String solution(String[] participant, String[] completion) {
        // 효율성 테스트 91/100 --> 실패

        String answer = "";

        List arrList = new ArrayList(Arrays.asList(completion));
        arrList.add(" ");

        completion = (String[]) arrList.toArray(completion);

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
            }
            
        }
        
        System.out.println(answer);
        return answer;
    }

    public String otherSolution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 배열을 순회하며 이름을 카운트합니다.
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주자 배열을 순회하며 이름을 하나씩 제거합니다.
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 카운트가 1인 이름이 바로 완주하지 못한 사람입니다.
        for (String p : map.keySet()) {
            if (map.get(p) > 0) {
                System.out.println(p);
                return p;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        Sol42576 sol = new Sol42576();
        sol.otherSolution(new String[] { "leo", "kiki", "eden" }, new String[] { "eden", "kiki" });
        sol.solution(new String[] { "marina", "josipa", "nikola", "vinko", "filipa" }, new String[] { "josipa", "filipa", "marina", "nikola" });
        sol.solution(new String[] { "mislav", "stanko", "mislav", "ana" }, new String[] { "stanko", "ana", "mislav" });
    }
}
