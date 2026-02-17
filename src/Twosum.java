import java.util.*;

// Two Sum II - Input Array is sorted :Find two numbers that add upto target.



class Twosum {
    public static void main(String[] args){
        int k=60;
        int[] nums=new int[]{2,5,6,7,9,12,55,66};
        System.out.println(Arrays.toString(Twosum.twoSum(nums, k)));
    }
    static int[] twoSum(int[] numbers, int target){
            int left=0,right=numbers.length-1;
            while(left<right){
                int sum=numbers[left]+numbers[right];
                if(sum==target){
                    return new int[]{left+1,right+1};
                }
                else if(sum<target){
                    left++;
                }
                else right--;
            }
            return new int[]{-1,-1};
        }
    }