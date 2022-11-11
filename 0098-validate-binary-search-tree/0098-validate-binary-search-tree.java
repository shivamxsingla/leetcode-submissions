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
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null) {
            List<Integer> f =new LinkedList<Integer>();
            return f;
        }
        else {
            List<Integer> left= inorderTraversal(root.left);
            List<Integer> right= inorderTraversal(root.right);
            List<Integer> f =new LinkedList<Integer>();
            if(left==null&& right==null){        
                f.add(root.val);
                return f;
            }
            else if(left==null){
                f.add(root.val);
                f.addAll(right);
                return f;
            }
            else if (right ==null){
                f.addAll(left);
                f.add(root.val);
                return f;
            }
             else {
                f.addAll(left);
                f.add(root.val);
                f.addAll(right);
                return f;
            }
        }
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> a= inorderTraversal(root);
        int size= a.size();
        for(int i=0; i<size-1; i++){
            if(a.get(i)>=a.get(i+1)) return false;
        }
        return true;
    }
}