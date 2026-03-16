class LargestTwice{
    public static void main(String[] args) {
        LargestTwice lt=new LargestTwice();
        int[] nums={3,6,1,0};
        System.out.println(lt.dominantIndex(nums));
    }
    public int dominantIndex(int[] nums) {
        int secMax=-1;
        int max=-1,index=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                secMax=max;
                max=nums[i];
                index=i;
            }
            else if(nums[i]>secMax && nums[i]<max ){
                secMax=nums[i];
            }
        }
        return (secMax*2<=max)?index:-1;
    }
}