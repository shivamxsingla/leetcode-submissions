class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        char[][] p = new char[numRows][s.length()];
        char[] ans = new char[s.length()];
        int ptr=0;
        int i=0; 
        int j=0;
        for(int i1=0; i1<numRows; i1++){
            for(int j1=0; j1<s.length(); j1++){
                p[i1][j1]='$';
            }
        }
     
        boolean state = true;
        while(ptr!=s.length()){
            if(state&&i!=numRows){
                p[i][j]=s.charAt(ptr);
                ptr++;
                i++;
            }
            else if(i==numRows){
                j++;
                i--;
                i--;
                p[i][j]=s.charAt(ptr);
                ptr++;
                j++;
                i--;
                state=!state;
            }
            else if(i==-1){
                i++;
                i++;
                j--;
                p[i][j]=s.charAt(ptr);
                i++;
                state=!state;
                ptr++;
            }
            else if(!state){
                p[i][j]=s.charAt(ptr);
                ptr++;
                j++;
                i--;
            }
        }
        //     for(int i1=0; i1<numRows; i1++){
        //     for(int j1=0; j1<s.length(); j1++){
        //         System.out.print(p[i1][j1]+" ");
        //     }
        //       System.out.println();
        // }
        ptr=0;
        for(int i1=0; i1<numRows; i1++){
            for(int j1=0; j1<s.length(); j1++){
                if(p[i1][j1]!='$'){
                    ans[ptr]=p[i1][j1];
                    ptr++;
                }
            }
        }
        String s1 = new String();
        for(int i1=0; i1<ptr; i1++){
            s1+=ans[i1];
        }
        return s1;
    }
}