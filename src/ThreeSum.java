import java.util.*;

public class ThreeSum {

//    3Sum:Find all unique triplets inn an array that sum to zero.

    public static void main(String[] args){
       int[] nums ={-1,0,1,2,-1,-4};
       System.out.print(threeSum(nums));
    }
    static List<List<Integer>> threeSum(int[] nums) {
        if(nums==null ||nums.length<3)return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();

        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
                }
                else if(sum>0)  right--;
                else left++;
            }
        }
        return new ArrayList<>(result);
    }

}
