import java.util.*;
public class SumMandN {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int start=scan.nextInt();
        System.out.print("Enter last number: ");
        int last=scan.nextInt();
        System.out.print("Sum between "+start+" and "+last+" Numbers is : "+sum(start,last));
    }
    static int sum(int start,int last){
        if(last==start)return start;
        return last+sum(start,last-1);
    }
}
