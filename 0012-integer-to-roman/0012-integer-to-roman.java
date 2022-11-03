class Solution {
    public String intToRoman(int num) {
        String ans="";
        for(int i=0; i<num/1000; i++){
            ans+='M';
        }
        
        num=num%1000;
        int hundred=num/100;
        if(hundred==1) ans+='C';
        else if(hundred==2) ans+="CC";
        else if(hundred==3) ans+="CCC";
        else if(hundred==4) ans+="CD";
        else if(hundred==5) ans+="D";
        else if(hundred==6) ans+="DC";
        else if(hundred==7) ans+="DCC";
        else if(hundred==8) ans+="DCCC";
        else if(hundred==9) ans+="CM";
        
        num=num%100;
        int tenth = num/10;
        if(tenth==1) ans+='X';
        else if(tenth==2) ans+="XX";
        else if(tenth==3) ans+="XXX";
        else if(tenth==4) ans+="XL";
        else if(tenth==5) ans+="L";
        else if(tenth==6) ans+="LX";
        else if(tenth==7) ans+="LXX";
        else if(tenth==8) ans+="LXXX";
        else if(tenth==9) ans+="XC";
        
        
        num=num%10;
        if(num==1) ans+='I';
        else if(num==2) ans+="II";
        else if(num==3) ans+="III";
        else if(num==4) ans+="IV";
        else if(num==5) ans+="V";
        else if(num==6) ans+="VI";
        else if(num==7) ans+="VII";
        else if(num==8) ans+="VIII";
        else if(num==9) ans+="IX";
        return ans;
    }
}