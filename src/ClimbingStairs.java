import java.util.*;
public class ClimbingStairs {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the steps : ");
        int n=scan.nextInt();
        System.out.print("You can climb in "+climbStairs(n)+" Distinct ways.");
    }
    public static int climbStairs(int n) {
        //     int[] dp=new int[n+1];
        //     dp[0]=1;
        //     dp[1]=1;
        //     for(int i=2;i<=n;i++)
        //         dp[i]=dp[i-2]+dp[i-1];
        //     return dp[n];

        int steps=0,pre=0,cur=1;

        for(int i=0;i<n;i++){
            steps=pre+cur;
            pre=cur;
            cur=steps;
        }
        return steps;
    }
}
