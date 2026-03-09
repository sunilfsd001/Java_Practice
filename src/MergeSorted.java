import java.util.*;
class MergeSorted {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        int[] result=new int[m+n];
        int index=0;
        for(int i=0;i<m;i++){
            result[index++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            result[index++]=nums2[i];
        }
        Arrays.sort(result);
        System.arraycopy(result, 0, nums1, 0, result.length);
        System.out.println(Arrays.toString(nums1));
    }
}
