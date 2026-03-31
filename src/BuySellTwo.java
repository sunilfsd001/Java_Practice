class BuySellTwo{
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
       int max=0,profit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            max=Math.max(max,prices[i]-min);
            if(prices[i-1]>prices[i]){
                profit+=max;
                max=0;
                min=prices[i];
            }
        }
        return profit+max;
    }
}