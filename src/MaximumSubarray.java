import java.util.*;
public class MaximumSubarray {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size=scan.nextInt();

        int[] nums=new int[size];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++)
            nums[i]=scan.nextInt();

        System.out.println("The Maximum sum of Subarray is " + maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {

        int sum=0,max=Integer.MIN_VALUE;

        for(int end=0;end<nums.length;end++){

            max=Math.max(max,sum+=nums[end]);
            if(sum<=0)sum=0;

        }

        return max;
    }
}
