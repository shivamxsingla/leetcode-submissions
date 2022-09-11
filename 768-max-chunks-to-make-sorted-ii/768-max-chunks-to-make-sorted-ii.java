class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[]  temp = new int[arr.length];
        int n=arr.length;
        for(int i=0; i<n; i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        int part=0;
        HashMap<Integer, Integer> sorted_data = new HashMap<>();
        HashMap<Integer, Integer> random_data = new HashMap<>();
        
        for(int i=0; i<n; i++){
            random_data.put(arr[i], 1+random_data.getOrDefault(arr[i], 0));
            sorted_data.put(temp[i], 1+sorted_data.getOrDefault(temp[i], 0));
            if(random_data.equals(sorted_data)){
                sorted_data.clear();
                random_data.clear();
                part++;
            }
        }
        
        return part;
    }
}