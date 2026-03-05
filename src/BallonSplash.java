import java.util.*;
public class BallonSplash {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>y)System.out.println("Alice");
        else if(x<y)System.out.println("Bob");
        else System.out.println("draw");
    }
}
