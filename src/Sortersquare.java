import java.util.*;

// Squares of a Sorted Array: Sort an array of squares in O(n) time.

class Sortersquare {
    public static void main(String[] args){
        int[] nums={-4,-2,5,0,3,7,9};
        System.out.print(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
