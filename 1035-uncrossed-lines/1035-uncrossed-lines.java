class Solution {
    static int [][] dp = new int[502][502];
    public static int helper(int []nums1, HashMap<Integer, ArrayList<Integer>> map, int index, int prev){
        if(prev!=-1 && dp[index][prev+1]!=-1) return dp[index][prev+1];
        if(index == nums1.length) return dp[index][prev+1] = 0;
        if(!map.containsKey(nums1[index])) return dp[index][prev+1] = helper(nums1, map, index+1, prev);
        if(map.get(nums1[index]).get(map.get(nums1[index]).size()-1)<=prev) return dp[index][prev+1] = helper(nums1, map, index+1, prev);
        ArrayList<Integer> list = map.get(nums1[index]);
        int idx = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>prev){
                idx = i;
                break;
            }
        }
        
        return dp[index][prev+1] = Math.max(helper(nums1, map, index+1, prev), 1 + helper(nums1, map, index+1, list.get(idx)));      
    }
    
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<dp.length; i++) Arrays.fill(dp[i], -1);
        for(int i=0; i<nums2.length; i++){
            if(!map.containsKey(nums2[i])){
               map.put(nums2[i], new ArrayList());
            }
            map.get(nums2[i]).add(i);
        }
        int ans = helper(nums1, map, 0, -1);
        return ans;
    }
}