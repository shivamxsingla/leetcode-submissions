class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int i=0;
        int j=0;
        int count=0;
        int n= nums.length;
        int prevzeroindex = 0;
        while(j<n){
            if(nums[j]==1){
                if(count==1)
                    max = Math.max(max, j-i);
                else
                    max = Math.max(max, j-i-count);
                j++;
            }
            else if(nums[j]==0&&count==0){
                count=1;
                prevzeroindex = j;
                max = Math.max(max, j-i);
                j++;
            }
            else if(nums[j]==0&&count==1){
                i = prevzeroindex+1;
                prevzeroindex=j;
                j++;
            }
        } 
        return max;
    }
}