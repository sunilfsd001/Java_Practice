import java.util.*;
public class CountDown {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=scan.nextInt();
        countDown(n);
    }
    static void countDown(int n){
        if(n==0)return;
        System.out.println(n);
        countDown(n-1);
    }
}
