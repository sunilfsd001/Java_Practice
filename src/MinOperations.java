import java.util.*;
public class MinOperations {
    public static void main (String[] args) throws java.lang.Exception {
    // your code goes here
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();

    while (testCase-- > 0) {
        int n = sc.nextInt();
        int ans = (n * (n + 2)) / 4;
        System.out.println(ans);
    }

    sc.close();
    }
}
