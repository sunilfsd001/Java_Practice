public class bestTimeToSell {
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i:prices){
            if(min>i)
                min=i;
            else
                max=Math.max(max,(i-min));
        }
        return max;
    }
}
