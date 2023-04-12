class Solution {
    public boolean check(TreeNode root1, TreeNode root2){
        if(root1==null&&root2==null) return true;
        if(root1==null||root2==null) return false;
        return (root1.val==root2.val)&&check(root1.left, root2.left)&&check(root1.right, root2.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null&&subRoot==null) return true;
        if(root==null||subRoot==null) return false;
        if(root.val==subRoot.val) {
            boolean ans = check(root, subRoot);
            if(ans) return ans;
        } 
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);   
    }
}

