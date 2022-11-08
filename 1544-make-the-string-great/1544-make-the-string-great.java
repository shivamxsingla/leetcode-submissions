class Solution {
    public boolean aresame(char a, char b){
        if(a-b=='A'-'a'||a-b=='a'-'A') return true;
        return false;
    }
    public String makeGood(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(st.size()==0){
                st.push(s.charAt(i));
            }
            else if(aresame(s.charAt(i), st.peek())){
                st.pop();
            }
            else{
                 st.push(s.charAt(i));
            }
        }
        String ans = "";
        for(char c : st){
            ans+=c;
        }
        return ans;
    }
}