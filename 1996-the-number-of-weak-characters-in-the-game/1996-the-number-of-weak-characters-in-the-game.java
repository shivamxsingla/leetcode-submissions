class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        Arrays.sort(arr, (a , b)->{
            if(a[0]!=b[0])return a[0]-b[0];
            else return b[1]-a[1];
        });

        int ans=0;
        int max=-1;
        
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i][1]<max) ans++;
            max=Math.max(max, arr[i][1]);
        }
        
        return ans;
    }
}