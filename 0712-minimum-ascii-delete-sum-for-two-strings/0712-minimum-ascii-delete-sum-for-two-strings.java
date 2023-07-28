class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        
        int ans = 0;
        for(int i=0; i<s1.length(); i++){
            ans += s1.charAt(i);
        }
        for(int i=0; i<s2.length(); i++){
            ans += s2.charAt(i);
        }
        
        int n = s1.length();
        int m = s2.length();
        int [][] dp = new int[n+1][m+1];
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                int possible = 0;
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    possible = dp[i-1][j-1] + s1.charAt(i-1);
                }
                int max = Math.max(dp[i-1][j], dp[i][j-1]);
                dp[i][j] = Math.max(max, possible);
            }
        }
        
        return ans - 2*dp[n][m];
        
    }
}