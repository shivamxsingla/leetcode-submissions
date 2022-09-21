class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int[] ans = new int[queries.length];
        int sum = 0;
        
        for( int a : nums ){
            if(a%2==0) sum+=a;
        }
        
        for(int i=0; i< queries.length; i++){
            int index = queries[i][1];
            int value = queries[i][0];
            
            if(nums[index]%2==0) sum -= nums[index];
            nums[index]+=value;
            if(nums[index]%2==0) sum += nums[index];
            ans[i]=sum;
        }
        
        return ans;
    }
}