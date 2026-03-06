public class Findmin {
    public static void main(String[] args){
        int[] nums={1,4,6,2,3,8,7,2,6,9};
        System.out.println(findMin(nums,0));
    }
    static int findMin(int[] nums,int len){
        if(len==nums.length)return nums[nums.length-1];
        return Math.min(nums[len],findMin(nums,len+1));
    }
}
