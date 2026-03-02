import java.util.*;
public class SumNnumbers {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=scan.nextInt();
        System.out.print("Sum of "+n+" Numbers is : "+sum(n));
    }
    static int sum(int n){
        if(n==1)return 1;
        return n+sum(n-1);
    }
}
