import java.util.*;
public class FruitBasket{
    public static void main(String[] args){
        int[] nums={1,2,3,2,2};
        System.out.println(totalFruit(nums));
    }
    static int totalFruit(int[] fruits) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,right=0;
        int max=0;
        while(right<fruits.length){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0)
                    map.remove(fruits[left]);
                left++;
            }

            right++;
            max=Math.max(max,right-left);
        }
        return max;
    }
}