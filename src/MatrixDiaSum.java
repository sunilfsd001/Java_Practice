class MatrixDiaSum{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = diagonalSum(matrix);
        System.out.println("The sum of the diagonal elements is: " + sum);
    }
    public static int diagonalSum(int[][] matrix) {
        int pSum=0;
        int sSum=0;
        for(int i=0;i<mat.length;i++){
            pSum+=mat[i][i];
            sSum+=mat[i][mat.length-i-1];
        }
        int mid=0;
        if(mat.length%2!=0){
           mid= mat[mat.length/2][mat.length/2];
        }
        return sSum+pSum-mid;
    }
}