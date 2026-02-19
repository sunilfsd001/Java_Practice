import java.util.*;
public class AllEven {
    public static void main(String[] args){

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the number of test cases :");
            int testcase=scan.nextInt();
            for(int i=0;i<testcase;i++){
                int size=scan.nextInt();
                int[] arr=new int[size];
                System.out.println("Enter the elements for the array :");
                for(int j=0;j<size;j++){
                    arr[j]=scan.nextInt();
                }
                int count=0;
                for(int num: arr){
                    if(num%2!=0)count++;
                }
                if(count%2==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            scan.close();
    }
}
