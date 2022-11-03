class Solution {
    public String largestNumber(int[] nums) {
       int n = nums.length;
       String []arr = new String[n];
       for(int i=0; i<n; i++){
           arr[i]=String.valueOf(nums[i]);
       }
        Comparator<String> comp = new Comparator<String>(){
		    @Override
		    public int compare(String str1, String str2){
		        String s1 = str1 + str2;
				String s2 = str2 + str1;
				return s1.compareTo(s2); 
		    }
	     };
       Arrays.sort(arr, comp);
       
       String s = new String();
       for(int i=n-1; i>=0; i--){
           s+=arr[i];
       }
        if(s.charAt(0) == '0')
			return "0";
       return s;
    }
}