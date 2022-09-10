class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i=0; 
        int j=0;
        int max=0;
        int sum=0;
        while(true){
            if(j==nums.length) break;            
            if(set.contains(nums[j])){
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            else{
                sum+=nums[j];
                set.add(nums[j]);
                max=Math.max(sum, max);
                j++;
            }
        }
        
        return max;
    }
}