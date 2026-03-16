class RotateArr{
    public static void main(String[] args) {
        RotateArr obj=new RotateArr();
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        obj.rotate(nums, k);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    static int[] reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
    }
}