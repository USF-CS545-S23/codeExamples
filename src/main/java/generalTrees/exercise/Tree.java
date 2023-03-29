package generalTrees.exercise;

import queues.ArrayQueue;

/** A general tree */
class Tree {
    private TreeNode root;

    private class TreeNode {
        Object data;
        TreeNode leftChild;
        TreeNode rightSibling;
        // TreeNode  parent; // optional
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

    /** Compute the height of the tree with the given root
     *
     * @param node root of the tree
     * @return height (number of levels)
     */
    private int height(TreeNode node) {
        int maxHeight = 0;
        // FILL IN CODE


        return maxHeight;
    }

    /**
     * Count nodes
     * @param node root of the tree
     * @return number of nodes in the tree with the given root
     */
    private int countNodes(TreeNode node) {
        int numNodes = 0;
        // FILL IN CODE

        return numNodes;
    }

    /**
     * Count leaves
     * @param node root of the tree
     * @return number of leaves in the tree with the given root
     */
    private int countLeaves(TreeNode node) {
        int numLeaves = 0;
        // FILL IN CODE

        return numLeaves;
    }

    /**
     * Print the values in the nodes of the tree using preorder traversal
     * @param node root of the tree
     */
    private void printPreorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        TreeNode curr = node.leftChild;
        while (curr != null)  {
            printPreorder(curr);
            curr = curr.rightSibling;
        }
    }

    /** Print the values in the nodes level by level
     *
     * @param node root of the tree
     */
    private void printByLevel(TreeNode node) {
        ArrayQueue queue = new ArrayQueue(100);
        queue.enqueue(node);

        while(!queue.empty()) {
            TreeNode curr = (TreeNode)queue.dequeue();
            System.out.println(curr.data);

            TreeNode child = curr.leftChild;
            while (child != null) {
                queue.enqueue(child);
                child = child.rightSibling;
            }

        }
    }
}

