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
class NodeDepthAndParentInfo{
    int depth;
    TreeNode parent;
    public NodeDepthAndParentInfo(int depth, TreeNode parent){
        this.depth = depth;
        this.parent = parent;
    }
    
}
class Solution {
    List<NodeDepthAndParentInfo> cousin;
    public void getCousins(TreeNode root, int x, int y, int depth, TreeNode parent){
        if(root == null || cousin.size() == 2){
            return;
        }
        
        if(root.val == x || root.val == y){
            cousin.add(new NodeDepthAndParentInfo(depth, parent));
            return;
        }
        getCousins(root.left, x, y, depth+1, root);
        getCousins(root.right, x, y, depth+1, root);
    }
    
    public boolean isCousins(TreeNode root, int x, int y) {
        cousin = new ArrayList<>();
        getCousins(root, x, y, 0, null);
        
        return (cousin.size() == 2) && (cousin.get(0).parent != cousin.get(1).parent) && (cousin.get(0).depth == cousin.get(1).depth);
    }
}