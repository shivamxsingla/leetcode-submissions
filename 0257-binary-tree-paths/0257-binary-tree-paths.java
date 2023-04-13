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
    List<String> list = new ArrayList<String>();
    public void binaryTreePaths(TreeNode root, String s) {
        if(root==null) return;  
        if(root.left==null && root.right==null) list.add(s+root.val);
        else{ 
        binaryTreePaths(root.left, s+root.val+"->");
        binaryTreePaths(root.right, s+root.val+"->");
            }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return list;  
        binaryTreePaths(root, new String());
        return list;
    }
}