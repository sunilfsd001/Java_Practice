import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the terms to print Fibonacci : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println(fibonacci(i));
        }
    }
    static int fibonacci(int n){
        if(n==0 || n==1)return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
