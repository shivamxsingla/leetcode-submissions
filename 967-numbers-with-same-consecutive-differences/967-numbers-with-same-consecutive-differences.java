class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> prev = new ArrayList<>();
        for(int i=1; i<=9; i++) prev.add(i);
        List<Integer> next = new ArrayList<>();
        
        for(int i=1; i<n; i++){
            for(int x : prev){
                int last = x%10;
                if(k==0){
                    next.add(x*10+last);
                    continue;
                }
                if(last+k<10){
                    next.add(x*10+last+k);
                }
                if(last-k>=0){
                    next.add(x*10+last-k);
                }
            }
            prev=next;
            next=new ArrayList<>();
        }
        
        int[] arr = new int[prev.size()];
        for (int i = 0; i < prev.size(); i++)
            arr[i] = prev.get(i);
        return arr;
    }
}