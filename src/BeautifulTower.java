class BeautifulTower{
    public static void main(String[] args){
        int[] heights={5,3,4,1,1};
        System.out.println(maximumSumOfHeights(heights));
    }
    static long maximumSumOfHeights(int[] maxHeights) {


            int n = maxHeights.length;
        long maxSum = 0;

        for (int i = 0; i < n; i++) {
            long sum = maxHeights[i];
            int leftHeight = maxHeights[i];
            int rightHeight = maxHeights[i];

            for (int j = i - 1; j >= 0; j--) {
                leftHeight = Math.min(leftHeight, maxHeights[j]);
                sum += leftHeight;
            }

            for (int k = i + 1; k < n; k++) {
                rightHeight = Math.min(rightHeight, maxHeights[k]);
                sum += rightHeight;
            }

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;


    //     int max=heights[0];
    //     for(int i=1;i<heights.length;i++){
    //         if(max<heights[i]){
    //             max=heights[i];
    //         }
    //     }
    //     long result=0;
    //     for(int num=0;num<heights.length;num++){
    //         if(heights[num]==max){
    //             for(int i=num-1;i>=0;i--){
    //                 heights[i]=Math.min(heights[i],heights[i+1]);
    //             }
    //             for(int i=num+1;i<heights.length;i++){
    //                 heights[i]=Math.min(heights[i-1],heights[i]);
    //             }
    //             long curResult=0;
    //             for(int n:heights){
    //                 curResult+=n;
    //             }
    //             result=Math.max(result,curResult);
    //         }
    // }
    //     return result;
    }
}