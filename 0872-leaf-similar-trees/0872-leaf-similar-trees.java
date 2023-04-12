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
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    public void inorder1(TreeNode root){
        if(root==null) return;
        inorder1(root.left);
        if(root.left==null&&root.right==null){
            list1.add(root.val);
        }
        inorder1(root.right);
    }
    public void inorder2(TreeNode root){
        if(root==null) return;
        inorder2(root.left);
        if(root.left==null&&root.right==null){
            list2.add(root.val);
        }
        inorder2(root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        inorder1(root1);
        inorder2(root2);
        if(list1.size()!=list2.size()) return false;
        int n = list1.size();
        for(int i=0; i<n; i++){
            if(list1.get(i)!=list2.get(i)) return false;
        }
        return true;
    }
}