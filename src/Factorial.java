import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=scan.nextInt();
        System.out.print("Factorial of "+n+" Numbers is : "+factorial(n));
    }
    static int factorial(int n){
        if(n==1)return 1;
        return n*factorial(n-1);
    }
}
