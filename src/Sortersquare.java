import java.util.*;

// Squares of a Sorted Array: Sort an array of squares in O(n) time.

class Sortersquare {
    public static void main(String[] args){
        int[] nums={-4,-2,-1,0,3,7,9};
        System.out.print(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
       /* for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;*/

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
            }

            index--;
        }

        return result;
    }
}
