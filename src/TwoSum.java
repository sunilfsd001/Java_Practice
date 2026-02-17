public class TwoSum {
    public static void main(String[] args){
        int[] numbers={2,5,8,12,20,25};
        int target=30;
        for(int i:twoSum(numbers,target)){
            System.out.print(i+" ");
        }
    }
    static int[] twoSum(int[] numbers, int target){
        int left=0,right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            else if(sum<target){
                left++;
            }
            else right--;
        }
        return new int[]{-1,-1};
    }
}
