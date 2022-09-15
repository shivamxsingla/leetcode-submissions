class Solution {
    public       int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    int left = max(A,E), right = max(min(C,G), left);
    int bottom = max(B,F), top = max(min(D,H), bottom);
    return (C-A)*(D-B) - (right-left)*(top-bottom) + (G-E)*(H-F);
    }
     public int max(int a, int b){
         if(a>b) return a;
          return b;
     }
    public int min(int a, int b){
        if(a<b) return a;
          return b;
    }
}