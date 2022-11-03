class Solution {
    public String reverseWords(String s) {
        String []arr = s.split(" ");
        String ans= new String();
        for(String st: arr){
            if(st.length()==0) continue;
            ans=" "+st+ans;
        }
        return ans.substring(1, ans.length());
    }
}