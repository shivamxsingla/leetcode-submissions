class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        int d = 5;
        while(n/d!=0){
            ans+=n/d;
            d=d*5;
        }
        return ans;
    }
}