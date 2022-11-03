class Solution {
    public int longestPalindrome(String[] words) {
        
        HashMap<String,Integer> map = new HashMap<>();
        int count=0;
        List<String> a = new ArrayList<>();
        int length=0;
        for(int i=0; i<words.length; i++){
            String curr = words[i];
            String rev = curr.substring(1,2) + curr.substring(0,1);
            
            if(curr.equals(rev)){
                if(a.contains(rev)){
                    a.remove(rev);
                    length+=4;
                }
                else{
                    a.add(rev);
                }
            }
            else if(!map.containsKey(rev)){
                map.put(curr, map.getOrDefault(curr,0)+1);
            }
            else if(map.containsKey(rev)){
                int f = map.get(rev);
                if(f>1){
                    map.put(rev, f-1); 
                    length+=4;
                }
                else if(f==1){
                    length+=4;
                    map.remove(rev);
                }
                
            }
        }
        int cap=0;
        if(a.size()>0) cap+=2;
        return length+cap;
        
        
    }
}