class RangeFreqQuery {
    HashMap<Integer, ArrayList<Integer>> map= new HashMap<>();
    
    public RangeFreqQuery(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i]))map.put(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }
       // System.out.println(map);
    }
    
    public int query(int left, int right, int value) {
        if(!map.containsKey(value)) return 0;
        ArrayList<Integer> list = map.get(value);
        int a = lower(list, left);
        int b = upper(list, right); 
        return b-a;
    }
        
    public static int lower(ArrayList<Integer> arr,int key){
        int low = 0;
        int high = arr.size();
        while(low < high){
        int mid = low + (high - low)/2;
        if(arr.get(mid) >= key){
            high = mid;
        }
        else{
            low = mid+1;
        }
        }
        return low;
    }
    
    public static int upper(ArrayList<Integer> arr,int key){
        int low = 0;
        int high = arr.size();
        while(low < high&&low!=arr.size()){
        int mid = low + (high - low)/2;
        if(arr.get(mid) <= key){
            low = mid+1;
        }
        else{
            high = mid;
        }
        }
        return low;
   }

}


