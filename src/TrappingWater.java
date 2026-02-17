import java.util.*;
class TrappingWater {
    public static void main(String[] args){
        int[] nums={0,1,0,2,1,0,1,3,2,1,2,5};
        System.out.print(trap(nums));
    }
    static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftmax = height[left], rightmax = height[right];
        int result = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                left++;
                leftmax = Math.max(leftmax, height[left]);
                result += leftmax - height[left];
            } else {
                right--;
                rightmax = Math.max(rightmax, height[right]);
                result += rightmax - height[right];
            }
        }
        return result;
    }
}
