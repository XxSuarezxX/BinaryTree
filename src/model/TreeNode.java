package model;

public class TreeNode {

    int data;
    int height;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}
