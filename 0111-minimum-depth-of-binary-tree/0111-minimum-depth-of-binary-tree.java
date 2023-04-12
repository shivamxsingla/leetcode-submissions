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
    int depth=Integer.MAX_VALUE;
    
    public void inorder(TreeNode root, int d){
        if(root==null) return;
        inorder(root.left, d+1);
        if(root.left==null&&root.right==null) {
            depth=Math.min(depth, d);
        }
        inorder(root.right, d+1);
    }
    
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        inorder(root, 1);
        return depth;
    }
}