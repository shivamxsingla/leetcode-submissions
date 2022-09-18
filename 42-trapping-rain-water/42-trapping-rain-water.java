class Solution {
    public int trap(int[] heights) {
        
        int n=heights.length;
        if(n<=2) return 0;
        
        int []left= new int[n];
        int []right= new int[n];
        left[0]=heights[0];
        
        for(int i=1; i<n; i++){
            left[i]=Math.max(heights[i],left[i-1]);
        }
        
        right[n-1]=heights[n-1];
        
        for(int i=n-2; i>=0; i--){
            right[i]=Math.max(heights[i],right[i+1]);
        }
        int x=0;
        for(int i=0; i<n; i++){
            x+=Math.min(left[i],right[i])-heights[i];
        }
        return x;
    }
}