class Node {

    String val;
    Node left, right;

    Node(String v) {
        val = v;
    }
}

public class EstMain {

    static int eval(Node root) {

        if (root.left == null && root.right == null)
            return Integer.parseInt(root.val);

        int l = eval(root.left);
        int r = eval(root.right);

        switch (root.val) {

            case "+": return l + r;
            case "-": return l - r;
            case "*": return l * r;
            case "/": return l / r;
        }

        return 0;
    }

    public static void main(String[] args) {

        Node root = new Node("*");

        root.left = new Node("+");
        root.right = new Node("5");

        root.left.left = new Node("3");
        root.left.right = new Node("2");

        System.out.println(eval(root));
    }
}
