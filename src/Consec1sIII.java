import java.util.*;
public class Consec1sIII {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size=scan.nextInt();
        int[] nums=new int[size];
        System.out.print("Enter the array elements : ");
        for(int i=0;i<size;i++)
            nums[i]=scan.nextInt();
        System.out.print("Enter size of zero can appear : ");
        int k=scan.nextInt();
        System.out.println("Longest Consective 1s appeared with K-0's is : "+checkConsec(nums,k));
    }
    public static int checkConsec(int[] nums,int k){
        int start=0;
        int max=0;
        int zeroCount=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0){
                zeroCount++;
            }

            while(zeroCount>k){
                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }
            max=Math.max(max,end-start+1);
        }
        return max;
    }
}
