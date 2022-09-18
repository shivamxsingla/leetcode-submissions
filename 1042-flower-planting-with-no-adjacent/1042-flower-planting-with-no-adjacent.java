class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        HashSet<Integer>[] graph = new HashSet[n];
        for(int i=0; i<n; i++){
            graph[i]= new HashSet<>();
        }
        for(int i=0; i<paths.length; i++){
            int u = paths[i][1]-1;
            int v = paths[i][0]-1;
            graph[u].add(v);
            graph[v].add(u);
        }
        int[] flower = new int[n];
        int [] color = {1, 2, 3, 4};
        
        for(int i=0; i<n; i++){
            for(int c : color) {
                boolean assign = true;
                for(int nbr : graph[i]) assign&=!(c==flower[nbr]);        
                 if(assign){
                     flower[i]=c;
                     break;
                 }               
            }  
               
        }
        
        return flower;
    }   
}
        