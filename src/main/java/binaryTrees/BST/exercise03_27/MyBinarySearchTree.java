package binaryTrees.BST.exercise03_27;

/** In class exercises. */
class MyBinarySearchTree {

    /** An inner class representing a node in a BST tree */
    private class BSTNode {
        int data; // value stored at the node
        BSTNode left; // left subtree
        BSTNode right; // right subtree

        BSTNode(int newdata) {
            data = newdata;
        }
    }
    //----------- End of the inner class BSTNode --------------

    private BSTNode root; // the root of the tree, an instance variable of class BinarySearchTree

    MyBinarySearchTree() {
        root = null; // initially, the tree is empty
    }

    /**
     * Insert a given element into the BST tree
     * @param elem element to insert into the BST tree
     */
    public void insert(int elem) {
        root = insert(root, elem);
    }

    /**
     * Insert elem into the tree with the given root
     * @param tree root of a tree
     * @param elem element to insert
     * @return the root of a tree that contains the new node
     */
    private BSTNode insert(BSTNode tree, int elem) {
        if (tree == null) {
            return new BSTNode(elem);
        }
        if (elem < tree.data) {
            tree.left = insert(tree.left, elem);
            return tree;
        } else {
            tree.right = insert(tree.right, elem);
            return tree;
        }
    }

    public void printPreorder() {
        printPreorder(root);
    }

    public void printPostorder() {
        printPostorder(root);
    }

    public int height() {
        return height(root);
    }

    public int countNodes() {
        return countNodes(root);
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    /** -------- Private methods ---------------- */
    /**
     * Print node values in the tree with the given root using preorder traversal
     * @param node root of the tree
     */
    private void printPreorder(BSTNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    /**
     * Print node values in the tree with the given root using postorder traversal
     * @param node root of the tree
     */
    private void printPostorder(BSTNode node) {
        if (node == null) {
            return;
        }
        // FILL IN CODE
    }

    /** Compute the height (the number of levels) of the tree
     * @param node root node
     * @return height
     */
    private int height(BSTNode node) {
        // FILL IN CODE


        return 0; // change
    }

    /**
     * Compute the number of nodes in the given tree
     * @param node root of the tree
     * @return number of nodes in the tree with the given root
     */
    private int countNodes(BSTNode node) {
        // return the number of nodes n the tree
        // FILL IN CODE
        return 0;
    }

    /**
     * Compute the number of leaves in the given tree
     * @param node root of the tree
     * @return number of leaves in the tree with the given root
     */
    private int countLeaves(BSTNode node) {
        // return the number of leaves (nodes without children) in the tree
        // FILL IN CODE

        return 0;
    }


    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(10);
        tree.insert(6);
        tree.insert(12);
        tree.printPreorder();
        tree.printPostorder();
        System.out.println(tree.height());
    }
}
