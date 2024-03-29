class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words= s.split(" ");
        if(words.length!=pattern.length()) return false;
        HashMap<Character,String> map = new HashMap<>();
        
        for(int i=0; i<words.length; i++){
            
            if(map.containsKey(pattern.charAt(i))){
                if(!words[i].equals(map.get(pattern.charAt(i))))return false;
            }
            else{
                if(map.containsValue(words[i])) return false;
                map.put(pattern.charAt(i),words[i]);
            }
        }
        
        return true;
        
    }
}