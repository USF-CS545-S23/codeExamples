package generalTrees;

import queues.ArrayQueue;

class Tree {
    private TreeNode root;

    private class TreeNode {
        Object data;
        TreeNode leftChild;
        TreeNode rightSibling;
        // TreeNode  parent; // optional
    }

    // Insert method has not been added ---------

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

