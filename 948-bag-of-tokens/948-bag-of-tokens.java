class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0) return 0;
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int score=0;
        while(i<j){
            if(power>=tokens[i]){
                score++;
                power-=tokens[i];
                i++;
            }
            else if(score>0){
                power+=tokens[j];
                j--;
                score--;
            }
            else{
                break;
            }
        }
        if(power>=tokens[i]) score++;
        return score;
    }
}