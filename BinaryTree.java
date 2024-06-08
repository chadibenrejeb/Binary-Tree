public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    Node createNode(int valeur) {
        Node N = new Node(valeur);
        return N;
    }

    void insertNewNode(int val) {
        root = insertRec(root, val);
    }

    Node insertRec(Node root, int val) {
        if (root == null) {
            return createNode(val);
        }

        if (val < root.data) {
            root.left = insertRec(root.left, val);
        } else if (val > root.data) {
            root.right = insertRec(root.right, val);
        }

        return root;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    Node minimum(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    Node maximum(Node node) {
        Node current = node;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    Node recherche(int x) {
        return searchRec(root, x);
    }

    Node searchRec(Node root, int x) {
        if (root == null || root.data == x) {
            return root;
        }

        if (root.data < x) {
            return searchRec(root.right, x);
        }

        return searchRec(root.left, x);
    }
    Node deleteNode(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.data) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.data) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minimum(root.right).data;

            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }
}


