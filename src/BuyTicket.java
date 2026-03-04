import java.util.*;
public class BuyTicket {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan=new Scanner(System.in);
        int testCase=scan.nextInt();
        while(testCase-- >0){

            int N=scan.nextInt();
            int K=scan.nextInt();

            int[] costOfSeats=new int[N];

            for(int j=0;j<N;j++)
                costOfSeats[j]=scan.nextInt();
            scan.nextLine();

            String seatAvailable=scan.nextLine();

            List<Integer> list=new ArrayList<>();

            for(int c=0;c<seatAvailable.length();c++){
                if(seatAvailable.charAt(c)=='0'){
                    list.add(costOfSeats[c]);
                }
            }
            if(list.size()<K){
                System.out.println(-1);
                continue;
            }
            Collections.sort(list);

            int amount=0;
            for(int add=0;add<K;add++){
                amount+=list.get(add);
            }
            System.out.println(amount);

        }
        scan.close();
    }
}
