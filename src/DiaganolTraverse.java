import java.util.*;
class DiagonalTraverse{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] result=findDiagonalOrder(matrix);
            System.out.print(Arrays.toString(result));
        }
    public static int[] findDiagonalOrder(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        int idx=0;
        int[] result=new int[row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                map.putIfAbsent((i+j),new ArrayList<>());
                map.get(i+j).add(mat[i][j]);
            }
        }
        for(int i=0;i<row+col-1;i++){
            if(i%2==0){
                for(int j=map.get(i).size()-1;j>=0;j--)
                    result[idx++]=map.get(i).get(j);
            }
            else{
                for(int n:map.get(i))
                    result[idx++]=n;
            }
        }
        return result;
    }
}