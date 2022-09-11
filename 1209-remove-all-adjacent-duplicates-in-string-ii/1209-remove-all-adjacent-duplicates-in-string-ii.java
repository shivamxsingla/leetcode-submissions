class Solution {
    public class pair{
        char ch;
        int count;
        pair(char c, int con){
            ch=c;
            count=con;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair> st= new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(st.size()==0||st.peek().ch!=s.charAt(i)){
                st.push(new pair(s.charAt(i), 1));
            }
            else{
                st.peek().count++;
            }
            if(st.peek().count==k) st.pop();
        }
        StringBuilder ans = new StringBuilder();
       while(st.size()!=0) {
           pair p = st.pop();
           int times=p.count;
           char c= p.ch;
           for(int i=0; i<times; i++)  ans = ans.append(c);
       }
        return ans.reverse().toString();
    }
}