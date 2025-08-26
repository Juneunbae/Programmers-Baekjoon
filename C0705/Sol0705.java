/** 
    문제 : 이진트리 순회

    문제 설명
    이진트리 순회를 출력하세요.

    TEST CASE
    4 2 5 1 6 3 7
**/
class Sol0705 {
    Node root;

    public void DFS(Node root) {
        if (root == null) return;
        DFS(root.lt);
        System.out.print(root.data + " ");
        DFS(root.rt);
    }

    public static void main(String[] args) {
        Sol0705 tree = new Sol0705();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
