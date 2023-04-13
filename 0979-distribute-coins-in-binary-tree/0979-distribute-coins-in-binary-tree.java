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
    int ans = 0;
    public int traverse(TreeNode root){
        if (root==null) return 0;
        int left = traverse(root.left);
        int right = traverse(root.right);
        ans+=Math.abs(left);
        ans+=Math.abs(right);
        root.val = root.val+left+right;
        return root.val-1;
    }
    public int distributeCoins(TreeNode root) {
        traverse(root);
        return ans;
    }
}