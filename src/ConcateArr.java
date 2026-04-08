class ConcateArr{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = getConcatenation(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
        static int[] getConcatenation(int[] nums1,int[] nums2) {
        int[] ans=new int[nums1.length*2];
        for(int i=0;i<nums1.length;i++){
            ans[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            ans[nums2.length+i]=nums2[i];
        }
        return ans;
    }

}