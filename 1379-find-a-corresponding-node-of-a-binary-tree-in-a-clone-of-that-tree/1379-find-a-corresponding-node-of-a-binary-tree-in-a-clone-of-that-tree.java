/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = new TreeNode();
    public void inorder(TreeNode cloned, int num){
        if(cloned==null) return;
        inorder(cloned.left, num);
        if(cloned.val==num){
            ans=cloned;
            return;
        }
        inorder(cloned.right, num);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        int num = target.val;
        inorder(cloned, num);
        return ans;
    }
}