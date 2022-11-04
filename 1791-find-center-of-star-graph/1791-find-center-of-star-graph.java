class Solution {
    public int findCenter(int[][] edges) {
        HashSet<Integer> set = new HashSet<>();
        set.add(edges[0][0]);
        set.add(edges[0][1]);
        if(set.contains(edges[1][0])) return edges[1][0];
        else return edges[1][1];
    }
}