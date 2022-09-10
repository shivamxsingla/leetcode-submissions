class Solution {
     static int lower_bound(int array[], int key)
    {
        int low = 0, high = array.length;
        int mid;
 
        while (low < high) {
 
            mid = low + (high - low) / 2;
            if (key <= array[mid]) {
                high = mid;
            }
            else {
 
                low = mid + 1;
            }
        }
 
        if (low < array.length && array[low] < key) {
            low++;
        } 
        return low;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n1=potions.length;
        int n2=spells.length;
        int [] arr= new int[n2];
        
        for(int i=0; i<n2; i++){  
            long a = potions[n1-1];
            long b = spells[i];
            if(a*b<success) continue;
            arr[i]=n1-lower_bound(potions, (int)Math.ceil(success*1.0/spells[i]));
            
        }
        return arr;
        
    }
}

