class Solution {
    static int ans=0;
    public void helper(TreeNode root, HashMap<Integer, Integer> map){
        if(root==null) return;
        map.put(root.val, 1 + map.getOrDefault(root.val, 0));
        if(root.left==null&&root.right==null){
            int odd = 0;
            for(int key : map.keySet()){
                if(map.get(key)%2==1) odd++; 
            }
            if(odd<=1) ans++;
        }
        helper(root.left, map);
        helper(root.right, map);
        map.put(root.val, map.getOrDefault(root.val, 0) - 1);                
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        ans=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        helper(root, map);
        return ans;
    }
}