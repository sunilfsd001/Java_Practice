class RemoveDuplicates {
public static void main(String[] args){
    int[] nums={0,0,1,1,1,2,2,3,3,4};
    System.out.println(removeDuplicates(nums));
}
static int removeDuplicates(int[] nums){
    int count=0;
    for(int i=1;i<nums.length;i++){
        if(nums[count]!=nums[i]){
            count++;
            nums[count]=nums[i];
        }
    }
    for(int i :nums)
        System.out.print(i+",");
    System.out.println();
    return count+1;
}
}
