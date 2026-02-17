class MostWater {

//   Container with most water:Maximum area between two vertical lines.


    public static void main(String[] args){
    int[] nums={1,8,6,2,5,4,8,3,7};

    System.out.println(maxArea(nums));
    }
    public static int maxArea(int[] height) {
        int max=0,amount=0;
        int left=0,right=height.length-1;
        while(left<=right){
            amount=Math.min(height[right],height[left])*(right-left);
            max=Math.max(amount,max);
            if(height[right]<height[left]){
                right--;
            }
            else left++;
        }
        return max;
    }
}
