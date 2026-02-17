import java.util.*;
class Bagoftokens {
    public static void main(String[] args){
        int[] tokens={100,200,300,400,500};
        int power=100;
        System.out.println(bagOftokens(tokens,power));
    }
    static int bagOftokens(int[] tokens, int power) {
        int left=0,right=tokens.length-1;
        int max=0,score=0;
        Arrays.sort(tokens);
        while(left<=right){
            if(power>=tokens[left]){
                power-=tokens[left];
                score+=1;
                left++;
                max=Math.max(score,max);
            }
            else if(score>0){
                power+=tokens[right];
                score-=1;
                right--;
            }
            else {
                break;
            }
        }
        return max;
    }
}
