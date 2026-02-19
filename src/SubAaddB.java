import java.util.*;
public class SubAaddB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (n < a) {
                System.out.println(n);
            } else {
                long d = a - b;
                long operations = (n - a) / d + 1;
                long result = n - operations * d;
                System.out.println(result);
            }
        }

        sc.close();
    }
}
