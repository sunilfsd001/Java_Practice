import java.util.*;
class ArrayProduct {
   public static void main(String[] args) {
        int[] nums={1,2,3,4};
        //     int len=nums.length;
        //     int[] preFix=new int[len];
        //     preFix[0]=nums[0];
        //     int[] sufFix=new int[len];
        //     sufFix[len-1]=nums[len-1];
        //     for(int i=1;i<len;i++){
        //         preFix[i]=preFix[i-1]*nums[i];
        //     }
        //     for(int i=len-2;i>=0;i--){
        //         sufFix[i]=sufFix[i+1]*nums[i];
        //     }
        //     nums[0]=sufFix[1];
        //     nums[len-1]=preFix[len-2];
        //     for(int i=1;i<len-1;i++){
        //          nums[i]=sufFix[i+1]*preFix[i-1];
        //     }
        //     return nums;
        // }

            int[] result = new int[nums.length];
            Arrays.fill(result, 1);
            int left = 1;
            for (int i = 0; i < nums.length; i++) {
                result[i] *= left;
                left *= nums[i];
            }
            int right = 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                result[i] *= right;
                right *= nums[i];
            }
        System.out.println(Arrays.toString(result));
        }
    }