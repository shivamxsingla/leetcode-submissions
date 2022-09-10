class Solution {
     public boolean valid(String s, HashSet<String> set){
         set.remove(s);
         boolean [] arr = new boolean[s.length()];
         int n= s.length();
        
         for(int i=0; i<n; i++){           
             for(int j=i; j>=0; j--){
                 if(set.contains(s.substring(j, i+1))){
                     if(j>0){
                         arr[i]|=arr[j-1];
                     }
                     if(j==0){
                         arr[i]=true;
                     }
                     if(arr[i]) break;
                 }
             }
         }
                 
         set.add(s);
         return arr[n-1];
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        
        HashSet<String> set = new HashSet<>();    
        for(String s : words){
            set.add(s);
        }
        List<String> ans = new ArrayList<>();
        for(String s: words){
            if(valid(s, set)) ans.add(s);
        }      
            
        return ans;
    }
    
   
}