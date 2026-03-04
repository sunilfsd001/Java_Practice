public class singleNum {
    public static void main(String[] args){
        int[] nums={2,2,1};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums){
        if(nums.length==1)return nums[0];
        int result=0;
        for(int i:nums)
            result=result^i;
        return result;
    }
}
