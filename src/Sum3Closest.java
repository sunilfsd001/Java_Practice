import java.util.*;
public class Sum3Closest {
    static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        int target=1;
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left=i+1,right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-ans)>Math.abs(target-sum)){
                    ans=sum;
                }
                if(target>sum){
                    left++;
                }
                else if(target<sum){
                    right--;
                }
                else{
                    System.out.println(sum);
                }
            }
        }
        System.out.println(ans);
    }
}
