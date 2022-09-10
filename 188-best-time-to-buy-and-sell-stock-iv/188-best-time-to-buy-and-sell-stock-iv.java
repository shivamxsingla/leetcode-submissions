class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if(n==0) return 0;
        int[][] a = new int[k+1][n];
        
        for(int i=1; i<=k; i++){
            for(int j=1; j<n; j++){
                for(int u=j; u>=0; u--){
                    a[i][j]=Math.max(Math.max(a[i][j-1],a[i][j]), a[i-1][u]+prices[j]-prices[u] );
                }
            }
        }
        
        return a[k][n-1];
    }
}