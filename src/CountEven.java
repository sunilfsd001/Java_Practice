public class CountEven {
    public static void main(String[] args) {
        int[] nums={2,5,6,3,1,4,5,9,7,5,6,8,12,36};
        System.out.println(count(nums,0));
    }
    static int count(int[] nums,int index){
        if(index==nums.length)return 0;
        if(nums[index]%2==0){
            return 1+count(nums,index+1);
        }
        return count(nums,index+1);
    }
}
