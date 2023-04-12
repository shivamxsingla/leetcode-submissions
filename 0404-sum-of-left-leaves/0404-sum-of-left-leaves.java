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
    public boolean leaf(TreeNode root){
        if(root==null) return false;
        return root.left==null && root.right==null;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 0;
        int ans=0;
        if(leaf(root.left)) ans+= root.left.val;
        ans+=sumOfLeftLeaves(root.left);
        ans+=sumOfLeftLeaves(root.right);
        return ans;
    }
}