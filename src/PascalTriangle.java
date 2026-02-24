import java.util.*;
public class PascalTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n=scan.nextInt();
        System.out.println(generate(n));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    List<Integer> preRow=list.get(i-1);
                    row.add(preRow.get(j) + preRow.get(j-1));
                }
            }
            list.add(row);
        }
        return list;
    }
}
