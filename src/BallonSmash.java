import java.util.*;
public class BallonSmash {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0) {

            int size = sc.nextInt();
            int[] arr = new int[size];
            int[] point = new int[size];

            for (int i = 0; i < size; i++)
                arr[i] = sc.nextInt();

            for (int i = 0; i < size; i++) {
                if (arr[i] == 0) continue;

                for (int j = i + 1; j < size; j++) {
                    if(arr[j]!=0)
                        point[j]++;

                    if (point[j] == arr[j]) {
                        arr[j] = 0;
                    }
                }
            }
            for(int i:point)
                System.out.print(i+" ");
        }
    }
}
