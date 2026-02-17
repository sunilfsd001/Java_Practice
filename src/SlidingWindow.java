import java.util.*;
public class SlidingWindow {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=scan.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter the elements for the array ");
        for(int j=0;j<size;j++){
            nums[j]=scan.nextInt();
        }
        System.out.println("Enter the length of sub array .");
        int k=scan.nextInt();
        int max=0;
        int curmax=0;
        for(int i=0;i<k;i++){
            curmax+=nums[i];
        }
        max=curmax;

        for(int i=k;i<nums.length;i++){
            curmax=curmax+nums[i]-nums[i-k];
            max=Math.max(max,curmax);
        }
        System.out.println(max);
        scan.close();
    }
}
