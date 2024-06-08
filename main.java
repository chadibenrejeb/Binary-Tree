public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertNewNode(70);
        tree.insertNewNode(77);
        tree.insertNewNode(75);
        tree.insertNewNode(60);
        tree.insertNewNode(45);
        tree.insertNewNode(30);
        tree.insertNewNode(81);
        tree.insertNewNode(64);
        tree.insertNewNode(52);
        tree.insertNewNode(62);

        System.out.print("Preorder traversal: ");
        tree.preOrder(tree.root);
        System.out.println();

        Node minNode = tree.minimum(tree.root);
        if (minNode != null) {
            System.out.println("Minimum value in the tree: " + minNode.data);
        } else {
            System.out.println("The tree is empty!");
        }

        Node maxNode = tree.maximum(tree.root);
        if (maxNode != null) {
            System.out.println("Maximum value in the tree: " + maxNode.data);
        } else {
            System.out.println("The tree is empty!");
        }

        Node searchedNode = tree.recherche(77);
        if (searchedNode != null) {
            System.out.println("Found value: " + searchedNode.data);
        } else {
            System.out.println("Value not found!");
        }

        // Delete a node
        tree.deleteNode(tree.root , 75);
        System.out.print("Preorder traversal after deleting 75: ");
        tree.preOrder(tree.root);
        System.out.println();
    }
}
