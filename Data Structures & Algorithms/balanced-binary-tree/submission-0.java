/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        //Balanced tree :- It is a tree that must be filled with the lemenent from left to right manner
        return isCheck(root) != -1;
    }
    private int isCheck(TreeNode root){
        if(root == null) return 0;

        int left = isCheck(root.left);
        if(left == -1) return -1;
        int right = isCheck(root.right);
        if(right == -1) return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);

    }
}
