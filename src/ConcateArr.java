class ConcateArr{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = getConcatenation(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
        static int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[nums.length+i]=nums[i];
        }
        return ans;
    }

}