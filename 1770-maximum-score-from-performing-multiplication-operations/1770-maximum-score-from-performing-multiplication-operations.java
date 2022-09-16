class Solution {
    public int maximumScore(int[] nums, int[] mul) {
        int[][] dp = new int[nums.length][mul.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<mul.length; j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        return helper(nums, mul, 0, nums.length-1, 0, dp);
    }
    public static int helper(int []nums, int []mul, int s, int e, int curr, int[][]dp){
        if(curr==mul.length){
            return 0;
        }
        else if(dp[s][curr]!=Integer.MIN_VALUE){
            return dp[s][curr];
        }
        else{ 
            int start = nums[s]*mul[curr];
            int end = nums[e]*mul[curr];
            int s1 = start+helper(nums, mul, s+1, e, curr+1, dp);
            int e1 =   end+helper(nums, mul, s, e-1, curr+1, dp);
            return dp[s][curr]=Math.max(s1, e1);
        }
    }
}