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
   
    HashMap<Integer, List<TreeNode>> dp = new HashMap<>();  
    public List<TreeNode> allPossibleFBT(int n) {       
        return helper(n);        
    }
    
    public List<TreeNode> helper(int n){
        if(dp.containsKey(n)) {
            return dp.get(n);
        }
        if(n%2==0){
            dp.put(0, new ArrayList<TreeNode>());
            return dp.get(0);
        }
        else if(n==1){
            List<TreeNode> ans =  new ArrayList<TreeNode>();
            ans.add(new TreeNode());
            dp.put(1, ans);
            return dp.get(1); 
        }
        else{
            List<TreeNode> ans = new ArrayList<>();
            for(int num=1; num<n && n-1-num>=0; num+=2){
                List<TreeNode> left = helper(num);
                List<TreeNode> right = helper(n-1-num);
                if(left.size()==0){
                    for(TreeNode rightsubtree: right)
                        ans.add(new TreeNode(0, null, rightsubtree));
                }
                else if(right.size()==0){
                    for(TreeNode leftsubtree: left){
                        ans.add(new TreeNode(0, leftsubtree, null));
                    }
                }
                else{
                    for(int i=0; i<left.size(); i++){
                        for(int j=0; j<right.size(); j++){
                            ans.add(new TreeNode(0, left.get(i), right.get(j)));
                        }
                    }
                }
            }
            dp.put(n, ans);
            return dp.get(n);
        }
    }
    
    
}