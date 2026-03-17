class SpiralMatrixII{
    public static void main(String[] args) {
        SpiralMatrixII obj=new SpiralMatrixII();
        int n=3;
        int[][] ans=obj.generateMatrix(n);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int counter=1;
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans[top][i]=counter++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[i][right]=counter++;
            }
            right--;
            for(int i=right;i>=left;i--){
                ans[bottom][i]=counter++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                ans[i][left]=counter++;
            }
            left++;
        }
        return ans;
    }
}