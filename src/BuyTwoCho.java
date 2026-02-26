import java.util.*;
public class BuyTwoCho {
    public static void main(String[] args){
            int[] prices={1,2,2};
            int money=3;
            Arrays.sort(prices);
            int chocolate=prices[0]+prices[1];
            if(chocolate<=money){
                money-=chocolate;
//                return money;
                System.out.println(money);
            }
//            return money;
        System.out.println(money);

    }
}
