import java.util.*;
public class SortColors {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size=scan.nextInt();
        int[] flag=new int[size];
        System.out.println("Enter the Array elements : ");
        for(int i=0;i<size;i++){
            flag[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(sort(flag)));

    }
    static int[] sort(int[] nums){
        int low=0,mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        return nums;
    }
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
