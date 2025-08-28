/** 
    문제 : 이진트리 순회

    문제 설명
    이진트리 레벨탐색 출력하세요.

    TEST CASE
    1 2 3 4 5 6 7 8
**/
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

class Sol0707 {
    Node root;

    public static void main(String[] args) {
        Sol0707 tree = new Sol0707();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        BFS(tree.root);
    }

    public static void BFS(Node root) {
        if (root == null) return;
      
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.print(currentNode.data + " ");

            if (currentNode.lt != null) {
                queue.offer(currentNode.lt);
            }

            if (currentNode.rt != null) {
                queue.offer(currentNode.rt);
            }
        }
    }
}
