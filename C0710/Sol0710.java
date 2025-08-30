/**
    문제 : Tree 밑단 노드까지의 가장 짧은 경로

    문제 설명
    아래 트리와 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
    각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를 길이로 하겠습니다.
    
        1
       / \
      2   3
     / \
    4   5

    TEST CASE
    -> 가장 짧은 길이는 3번 노드까지의 길이는 1이다.
**/

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    Node(int val) {
        data = val;
    }
}

public class Sol0710 {
    Node root;

    public static void main(String[] args) {
        Sol0710 tree = new Sol0710();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }

    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i <= len; i++) {
                Node currentNode = queue.poll();
                if (currentNode.lt == null && currentNode.rt == null) return L;
                else if (currentNode.lt != null) queue.offer(currentNode.lt);
                else if (currentNode.rt != null) queue.offer(currentNode.rt);
            }
            L++;
        }

        return 0;
    }
}
