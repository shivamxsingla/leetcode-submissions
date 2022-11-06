class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        boolean []res = new boolean[n];
        for(int r : restricted){
            res[r]=true;
        }
        boolean []vis = new boolean[n];
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++){
            graph[i]=new ArrayList<>();
        }
        for(int []d : edges){
            graph[d[0]].add(d[1]);
            graph[d[1]].add(d[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0]=true;
        int ans=0;
        while(q.size()!=0){
            ans++;
            int node = q.remove();
            for(int nbr : graph[node]){
                if(!vis[nbr]&&!res[nbr]){
                    vis[nbr]=true;
                    q.add(nbr);
                }
            }
        }
        return ans;
    }
}