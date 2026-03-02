import java.util.*;
public class SubarraySum {


//  Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//A subarray is a contiguous non-empty sequence of elements within an array.


    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size=scan.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++) {
            System.out.print("Enter the  element "+(i+1)+": ");
            nums[i] = scan.nextInt();
        }
        System.out.print("Enter the target : ");
        int target=scan.nextInt();
        System.out.println(countSum(nums,target)+" Subarrays found ");
    }
    public static int countSum(int[] nums,int k){
        int count=0;
        for(int start=0;start<nums.length;start++){
            int sum=0;
            for(int end=start;end<nums.length;end++){
                sum+=nums[end];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
}
