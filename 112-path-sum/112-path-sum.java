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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root== null) return false;
        if(targetSum==root.val&& root.left==null&& root.right==null) return true;
        int val=root.val;        
        
        boolean left=hasPathSum(root.left,targetSum-val);
        boolean right= hasPathSum(root.right,targetSum-val);
        return left || right;
        
        
    }
}