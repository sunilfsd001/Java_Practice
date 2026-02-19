import java.util.*;
public class MaxConsective1s {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=scan.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++)
            arr[i]=scan.nextInt();

        System.out.println(maxConsec1s(arr));
    }
    public static int maxConsec1s(int[] nums){
        int max=0,count=0;

        for(int num:nums){
            if(num==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);

        }
        return max;
    }
}
