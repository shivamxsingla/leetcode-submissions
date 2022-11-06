class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int [] indegree = new int[n];
        for(int[] d : roads){
            indegree[d[0]]++;
            indegree[d[1]]++;
        }
        Arrays.sort(indegree);
        long ans=0;
        for(int i=0; i<indegree.length; i++){
            ans+=(long)(i+1)*indegree[i];
        }
        return ans;
    }
}