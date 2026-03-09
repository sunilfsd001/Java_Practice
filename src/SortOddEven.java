import java.util.*;
public class SortOddEven {
    static void main(String[] args) {
        int[] nums={4,1,2,3};
        int[] even =new int[(nums.length+1)/2];
        int[] odd =new int[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(i%2==0)even[i/2]=nums[i];
            else odd[i/2]=nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int[] temp=new int[nums.length];
        for(int i=odd.length-1;i>=0;i--){
            temp[odd.length-i-1]=odd[i];
        }
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0)result[i]=even[i/2];
            else result[i]=temp[i/2];
        }
        System.out.println(Arrays.toString(result));
    }
}
