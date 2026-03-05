import java.util.*;
public class ColorFestival {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        while(testCase-->0){
            int preColor=0;
            int count=0;
            int size=sc.nextInt();
            int[] arr=new int[size];
            for(int i=0;i<size;i++)
                arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int j=0;j<size;j++){
                if(arr[j]!=preColor){
                    count++;
                    preColor=arr[j];
                }
            }
            System.out.println(count);
        }
    }
}
