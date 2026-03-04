import java.util.*;
public class EraseMax {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();
            long S = sc.nextLong();

            long maxWithoutSix = 5 * N;
            long totalMax = 6 * N;

            long penalty = 0;
            if (S > maxWithoutSix) {
                penalty = S - maxWithoutSix;
            }

            System.out.println(totalMax - penalty);
        }

        sc.close();
    }
}
