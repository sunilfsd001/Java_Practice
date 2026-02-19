import java.util.*;
public class PaymentScheme {
    public static void main (String[] args)
    {

        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        if((x*4)>=300 || (x*4+100)>300){
            System.out.println(300);
        }
        else {
            System.out.println(x * 4 + 100);
        }
        scan.close();
    }
}
