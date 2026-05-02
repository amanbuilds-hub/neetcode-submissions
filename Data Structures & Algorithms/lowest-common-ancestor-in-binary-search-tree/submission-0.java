class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Traverse the tree
        while (root != null) {

            // Both nodes lie in left subtree
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }
            // Both nodes lie in right subtree
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
            // Split happens here OR one node is root
            else {
                return root;
            }
        }
        return null;
    }
}
