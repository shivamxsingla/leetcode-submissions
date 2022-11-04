class Solution {
    public String reverseVowels(String s) {
        String sv = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                sv+=c;
            }
        }
        char [] arr = s.toCharArray();
        int ptr=sv.length()-1;
        for(int i=0; i<s.length(); i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') {
                arr[i]=sv.charAt(ptr);
                ptr--;
            }
        }
        return new String(arr);
    }
}