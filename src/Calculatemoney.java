import java.util.*;
public class Calculatemoney{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the days : ");
        int n=scan.nextInt();
        System.out.println(totalMoney(n));
    }
    static int totalMoney(int n) {
        int sum=0;
        int start=1;
        int count=start;
        for(int i=1;i<=n;i++){
            sum+=count;
            count++;
            if(i%7==0){
                count=++start;
            }
        }
        return sum;
    }
}