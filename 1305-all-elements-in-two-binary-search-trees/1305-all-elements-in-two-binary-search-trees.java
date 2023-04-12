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
    public List<Integer> inorder(TreeNode root) {       
        if(root==null)
            return new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        ans.addAll(inorder(root.left));
        ans.add(root.val);
        ans.addAll(inorder(root.right));

        return ans;
    }
    public List<Integer> merge(List<Integer> list1, List<Integer> list2){
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();
        while(i<list1.size()||j<list2.size()){
            if(i==list1.size()){
                for(int k=j; k<list2.size(); k++){
                    list.add(list2.get(k));
                }
                break;
            }
            else if(j==list2.size()){
                for(int k=i; k<list1.size(); k++){
                    list.add(list1.get(k));
                }
                break;
            }
            else if(list1.get(i)<list2.get(j)){
                list.add(list1.get(i));
                i++;
            }
            else{
                list.add(list2.get(j));
                j++;
            }
        }
        return list;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = inorder(root1);
        List<Integer> list2 = inorder(root2);
        return merge(list1, list2);
    }
}