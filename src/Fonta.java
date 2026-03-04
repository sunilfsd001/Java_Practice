import java.util.*;
public class Fonta {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        if(s.substring(2).equals("nta"))System.out.println("yes");
        else System.out.println( "no");
        scan.close();
    }
}
