import java.util.*;
public class HouseRobber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number houses : ");
        int size=scan.nextInt();
        int[] nums=new int[size];
        System.out.print("Enter the amount that every House holds : ");
        for(int i=0;i<size;i++)
            nums[i]=scan.nextInt();
        System.out.println("You can rob : " +rob(nums));
    }
    static int rob(int[] nums){
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}
