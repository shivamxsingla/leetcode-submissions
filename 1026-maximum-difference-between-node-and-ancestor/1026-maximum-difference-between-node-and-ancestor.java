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
    int diff = 0;
    public class pair{
        int min;
        int max;
        pair(){}
        pair(int val){
            min=val;
            max=val;
        }
        pair(int val1, int val2){
            min=val1;
            max=val2;
        }
    }
    
    public pair traverse(TreeNode root){
        if(root.left==null&&root.right==null) return new pair(root.val);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(root.left!=null){
            pair left = traverse(root.left);
            diff = Math.max(diff, Math.abs(root.val-left.min));
            diff = Math.max(diff, Math.abs(root.val-left.max));
            min= Math.min(left.min, min);
            min= Math.min(root.val, min);
            max= Math.max(left.max, max);
            max= Math.max(root.val, max);
        }
        if(root.right!=null){
            pair left = traverse(root.right);
            diff = Math.max(diff, Math.abs(root.val-left.min));
            diff = Math.max(diff, Math.abs(root.val-left.max));
            min= Math.min(left.min, min);
            min= Math.min(root.val, min);
            max= Math.max(left.max, max);
            max= Math.max(root.val, max);
        }
        return new pair( min, max);
    }
    
    public int maxAncestorDiff(TreeNode root) {
        traverse(root);
        return diff;
    }
}