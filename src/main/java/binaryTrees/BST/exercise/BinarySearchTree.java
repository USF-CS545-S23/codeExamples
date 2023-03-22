package binaryTrees.BST.exercise;

import java.util.Stack;

/** Implementation of a binary search tree.
 *  The code has been modified from the code of Prof. Galles.
 */
class BinarySearchTree {

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

    BinarySearchTree() {
        root = null; // initially, the tree is empty
    }

    public boolean findIterative(int elem) {
        BSTNode current = root;
        while (current != null) {
            if (current.data == elem)
                return true;
            if (current.data < elem)
                current = current.right;
            else
                current = current.left;
        }
        return false;
    }

    public void insertIterative(int elem) {
        BSTNode prev = null;
        BSTNode current = root;
        if (root == null) {
            root = new BSTNode(elem);
            return;
        }
        // FILL IN CODE

    }


    /** Print the binary tree using a preorder traversal
     */
    private void printPreorderIterative() {
        if (root != null) {
            Stack<BSTNode> stack = new Stack<>();
            stack.push(root);
            // FILL IN CODE

        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertIterative(5);
        tree.insertIterative(3);
        tree.insertIterative(7);
        tree.insertIterative(1);
        tree.insertIterative(10);
        tree.insertIterative(6);
        tree.insertIterative(12);
       // tree.printPreorderIterative();
    }
}
