public class SearchPosition {
    public static void main(String[] args) {
        int result=0;
        int[] nums={1,3,5,6};
        int target=5;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            if(nums[mid]==target){
                result=mid;
                break;
            }
            else result=left;
        }
        System.out.println(result);
    }
}
