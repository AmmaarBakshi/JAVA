class Node {

    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}

public class AvlMain {

    static int h(Node n) {
        return n == null ? 0 : n.height;
    }

    static int balance(Node n) {
        return n == null ? 0 : h(n.left) - h(n.right);
    }

    static Node rightRotate(Node y) {

        Node x = y.left;
        Node t = x.right;

        x.right = y;
        y.left = t;

        y.height = Math.max(h(y.left), h(y.right)) + 1;
        x.height = Math.max(h(x.left), h(x.right)) + 1;

        return x;
    }

    static Node leftRotate(Node x) {

        Node y = x.right;
        Node t = y.left;

        y.left = x;
        x.right = t;

        x.height = Math.max(h(x.left), h(x.right)) + 1;
        y.height = Math.max(h(y.left), h(y.right)) + 1;

        return y;
    }

    static Node insert(Node node, int key) {

        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else
            node.right = insert(node.right, key);

        node.height = 1 + Math.max(h(node.left), h(node.right));

        int b = balance(node);

        if (b > 1 && key < node.left.key)
            return rightRotate(node);

        if (b < -1 && key > node.right.key)
            return leftRotate(node);

        return node;
    }

    static void preorder(Node root) {

        if (root != null) {

            System.out.print(root.key + " ");

            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {

        Node root = null;

        int arr[] = {10, 20, 30, 40, 50, 25};

        for (int i : arr)
            root = insert(root, i);

        preorder(root);
    }
}
