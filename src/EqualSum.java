class EqualSum{
    public static void main(String[] args){
        int[][] grid = {{1,4}, {2,3}};
        System.out.println(canEqualSum(grid));
    }
    static boolean canEqualSum(int[][] grid){
      int row=grid.length,col=grid[0].length;
        long sum=0;
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                sum+=grid[i][j];
        
        if(sum%2!=0)return false;
        long target=sum/2;

        long curSum=0;
        for(int i=0;i<row-1;i++){
            for(int j=0;j<col;j++) curSum+=grid[i][j];
            if(curSum==target) return true;
        }
        curSum=0;
        for(int i=0;i<col-1;i++){
            for(int j=0;j<row;j++) curSum+=grid[j][i];
            if(curSum==target) return true;
        }
        return false;
    }
}