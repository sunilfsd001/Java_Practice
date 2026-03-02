import java.util.*;public class PascalTriangleII {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Row Number :");
        int rowNum=scan.nextInt();
        System.out.println(getRow(rowNum-1));
    }
    static public List<Integer> getRow(int numRows) {
        if(numRows==0){
            List<Integer> innerList = new ArrayList<>();
            innerList.add(1);
            return innerList;
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<=numRows;i++){
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
        return list.getLast();
    }
}
