import java.util.*;
public class RushToExam {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int a=scan.nextInt();
        int sum=n*a;
        if(sum>=m && a<=10 && n<=24 && m<=100 )
        {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
