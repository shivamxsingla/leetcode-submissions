class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int mul = (s.charAt(0)=='-') ? -1 : 1;
        int i=0;
        long ans=0;
        if(s.charAt(0)=='-'||s.charAt(0)=='+') i++;   
        while(true){
            if(i==s.length()||!(s.charAt(i)>='0'&&s.charAt(i)<='9')) break;
            ans=ans*10+(s.charAt(i)-'0');
            i++;
            if(ans>Integer.MAX_VALUE){
                if(mul==1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
        }        
        return (int)ans*mul;
    }
}