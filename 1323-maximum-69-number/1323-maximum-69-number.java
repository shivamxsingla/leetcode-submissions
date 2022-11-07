class Solution {
    public int maximum69Number (int num) {
        int ans = 0;
        StringBuilder s = new StringBuilder(String.valueOf(num));
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='6'){
                s.setCharAt(i, '9');
                return Integer.parseInt(new String(s));
            }
        }
        return num;
    }
}