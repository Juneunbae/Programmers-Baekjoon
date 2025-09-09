/**
    문제 : 경로탐색(인접리스트, ArrayList)

    문제 설명
    방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
    
    그래프에서 1번에서 5번으로 가는 가지 수는
        1 2 3 4 5
        1 2 5
        1 3 4 2 5
        1 3 4 5
        1 4 2 5
        1 4 5
    총 6가지 입니다.

    입력
    첫째 줄에는 정점의 수(1 <= N <= 20)와 간선의 수 M가 주어진다.
    그 다음부터 M줄에 걸쳐 연결정보가 주어진다.

    출력
    총 가지수를 출력한다.

    TEST CASE
    5 9 
    1 2 
    1 3 
    1 4
    2 1
    2 3
    2 5 
    3 4
    4 2
    4 5
    -> 6
**/
import java.util.ArrayList;
import java.util.Scanner;

public class Sol0712 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int v) {
        if (n == v) answer ++;
        else {
            for (int nextV : graph.get(v)) {
                if (ch[nextV] == 0) {
                    ch[nextV] = 1;
                    DFS(nextV);
                    ch[nextV] = 0;
                }
            }
        }
    }
}
