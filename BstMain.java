import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
    }
}

public class BstMain {

    static void vertical(Node root) {

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        Queue<Object[]> q = new LinkedList<>();
        q.add(new Object[]{root, 0});

        while (!q.isEmpty()) {

            Object[] arr = q.poll();

            Node temp = (Node) arr[0];
            int hd = (int) arr[1];

            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(temp.data);

            if (temp.left != null)
                q.add(new Object[]{temp.left, hd - 1});

            if (temp.right != null)
                q.add(new Object[]{temp.right, hd + 1});
        }

        for (var i : map.values())
            System.out.println(i);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        vertical(root);
    }
}
