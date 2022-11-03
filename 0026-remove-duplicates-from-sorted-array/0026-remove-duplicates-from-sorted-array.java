class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        int k=0;
        while(true){
            if(j==nums.length){
                k++;
                break;
            }
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                k++;
                nums[i]=nums[j];
                j++;
            }
        }
        return k;
    }
}