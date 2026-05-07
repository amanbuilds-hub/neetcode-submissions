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

    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // store inorder values with their indices
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder,
                          int preStart,
                          int inStart,
                          int inEnd) {

        // Base Case
        if(inStart > inEnd) {
            return null;
        }

        // Root node
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        // Find root index in inorder
        int index = map.get(rootVal);

        // Number of nodes in left subtree
        int leftSize = index - inStart;

        // Build left subtree
        root.left = build(preorder,
                          preStart + 1,
                          inStart,
                          index - 1);

        // Build right subtree
        root.right = build(preorder,
                           preStart + leftSize + 1,
                           index + 1,
                           inEnd);

        return root;
    }
}