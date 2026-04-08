import java.util.*;

class SpiralMatrix{
    public static void main(String[] args) {
        SpiralMatrix sm=new SpiralMatrix();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sm.spiralOrder(matrix));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int tpBtm=matrix.length;
        int rtLft=matrix[0].length;
        int top=0,bottom=tpBtm-1;
        int left=0,right=rtLft-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return list;
    }
}