class Solution {
    int [] rank = new int[4];
    int [] parent = new int[4];
    
    public int find(int x){
        if(parent[x]==x) return x;
        else return parent[x]= find(parent[x]);
    }
    
    public void union(int u, int v){
        if(rank[u]>rank[v]){
            parent[v]=u;
        }
        else if(rank[v]>rank[u]){
            parent[u]=v;
        }
        else{
            parent[v]=u;
            rank[u]++;
        }
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        rank = new int[n];
        parent = new int[n];
        for(int i=0; i<n; i++){
            parent[i]=i;
        }
        for(int []e : edges){
            int u=e[0]; int v=e[1];
            int a = find(u);
            int b = find(v);
            if(a!=b){
                union(a, b);
            } 
        }
        return find(source)==find(destination);
    }
}