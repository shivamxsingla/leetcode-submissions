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
    public String tree2str(TreeNode root) {
        
        if(root==null) return new String();
        String left = tree2str(root.left);
        String right = tree2str(root.right);
        
        String ans = new String(String.valueOf(root.val));
        if(root.left==null&&root.right==null) return ans;
        ans+="(" + left +")";
        if(right.length()!=0) ans+="("+right+")";
        return ans;
       
    }
}