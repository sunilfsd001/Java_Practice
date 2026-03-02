import java.util.*;
public class PrintNnumbers {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=scan.nextInt();
        printNnumber(n);
    }
    static void printNnumber(int n){
        if(n==0)return;
        printNnumber(n-1);
        System.out.println(n);
    }
}
