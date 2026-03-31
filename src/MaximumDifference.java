class MaximumDifference{
    public static void main(String[] args) {
        int[] nums={7,1,5,4};
        System.out.println(maximumDifference(nums));
    }
    public static int maximumDifference(int[] nums) {
        int min=nums[0];
        int maxDiff=-1;
        for(int i=1;i<nums.length;i++){
            if(min<nums[i]){
                maxDiff=Math.max(maxDiff,nums[i]-min);
            }
            else{
                min=nums[i];
            }
        }
        return maxDiff;
    }
}