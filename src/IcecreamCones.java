import java.util.*;
public class IcecreamCones {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int testcase=scan.nextInt();
        for(int i=0;i<testcase;i++){
            int grams=scan.nextInt();
            int melt=scan.nextInt();
            int minutes=scan.nextInt();
            int balance=grams-(melt*minutes);
            if(balance>0)
                System.out.println(balance);
            else
                System.out.println(0);

        }
    }
}
