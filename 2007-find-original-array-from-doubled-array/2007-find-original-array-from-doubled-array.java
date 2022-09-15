class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2==1) return new int[0];
        Arrays.sort(changed);
        HashMap<Integer, Integer> process = new HashMap<>();
        for(int a : changed){
            process.put(a, 1+process.getOrDefault(a, 0));
        }
        List<Integer> arr = new ArrayList<>();
        for(int num: changed){
            int find = num*2;
            if(process.get(num)==0) continue;
            if(process.getOrDefault(find, 0)==0) return new int[0];
            arr.add(num);
            process.put(num, process.get(num)-1);
            process.put(find, process.get(find)-1);
        }
        int []org = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            org[i]=arr.get(i);
        }
        return org;
    }
}