import java.util.*;
public class Minimumsize{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size=scan.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++)
            arr[i]=scan.nextInt();

        System.out.println("Enter the target : ");
        int target=scan.nextInt();

        System.out.print(minSubArrayLen(arr,target));
    }
    public  static int minSubArrayLen(int[] nums, int target) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int start=0;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            while(sum>=target){
                min=Math.min(min,end-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
