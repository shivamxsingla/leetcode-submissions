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
    int ans=0;
    public void helper(TreeNode root, String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans+=Integer.parseInt(s+root.val,2);
        }
        helper(root.left, s+root.val);
        helper(root.right, s+root.val);
    }
    public int sumRootToLeaf(TreeNode root) {
        helper(root, new String());
        return ans;
    }
}