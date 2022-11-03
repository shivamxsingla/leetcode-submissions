class Solution {
    public String simplifyPath(String path) {
        String [] arr = path.split("/");
        String ans="";
        Stack<String> st = new Stack<>();
        for(String s : arr){
            if(s.length()==0||s.equals(".")) continue;
            else if(s.equals("..")) { if(st.size()!=0) st.pop();}
            else st.push(s);
        }
        while(st.size()!=0){
            ans="/"+st.pop()+ans;
        }
        if(ans.length()==0) ans="/";
        return ans;
    }
}