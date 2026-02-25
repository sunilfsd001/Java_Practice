import java.util.*;

public class HouseRobber2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number houses : ");
        int size=scan.nextInt();
        int[] nums=new int[size];
        System.out.print("Enter the amount that every House holds : ");
        for(int i=0;i<size;i++)
            nums[i]=scan.nextInt();
        System.out.println("You can rob : " +Math.max(rob(nums,0,size-1),rob(nums,1,size)));
    }
    static int rob(int[] nums,int start,int end){
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (;start<end;start++) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + nums[start], prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}
