public class FindPivot {
    static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        int[] sumLeft=new int[nums.length];
        int[] sumRight=new int[nums.length];
        sumLeft[0]=nums[0];
        sumRight[nums.length-1]=nums[nums.length-1];
        for(int i=1,j=nums.length-2;i<nums.length && j>=0;i++,j--){
            sumLeft[i]=sumLeft[i-1]+nums[i];
            sumRight[j]=sumRight[j+1]+nums[j];
        }
        for(int i=0;i<nums.length;i++){
            if(sumLeft[i]==sumRight[i]) System.out.println(i);
        }
        System.out.println(-1);
    }
}
