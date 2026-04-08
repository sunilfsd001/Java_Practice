import java.util.*;
class SortMatrixDiagonally{
    public static void main(String[] args){
        int[][] mat={ {5,12,3},
                      {24, 0, 6},
                      {50,18,6},
                      {4, 5, 1}};
        for(int[] x:diagonalSort(mat))
            System.out.println(Arrays.toString(x));
    }
    static int[][] diagonalSort(int[][] mat) {
        Map<Integer,List<Integer>> map=new HashMap<>();


        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat[0].length;col++){
                int key=row-col;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[row][col]);
            }
        }


       for (List<Integer> values : map.values()){
         Collections.sort(values); 
        }

        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat[0].length;col++){
                int key=row-col;
                if(map.containsKey(key)){
                    mat[row][col]=map.get(key).get(0);
                    map.get(key).remove(0);
                }
            }
        }

        return mat;
    }
}