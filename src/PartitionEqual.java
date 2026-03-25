class PartitionEqual{
    public static void main(String[] args){
        int[] nums={1,5,11,5};
        System.out.prinltn(canPartiton(nums));
    }
    static boolean canPartition(int[] nums) {
        int sum=0;
       for(int n:nums){
        sum+=n;
       }
       if(sum%2!=0)return false;
       
       boolean[] dp = new boolean[10001];
        dp[0] = true;
        for (int num : nums) {
            for (int j = 10000; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
            if (dp[sum / 2]) 
                return true;
        }
        return dp[sum / 2];
    }
}