import java.util.*;
public class Triangle {
    public static void main(String[] args){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3,1)));
        triangle.add(new ArrayList<>(Arrays.asList(6,5,1)));
        triangle.add(new ArrayList<>(Arrays.asList(4, 3, 0, 1)));
//      Some Test Cases

//      [[2],[3,4],[6,5,9],[4,4,8,0]]
//      [[-10]]
//      [[-1],[2,3],[1,-1,-3]]
//      [[0]]
//      [[0],[0,0],[0,0,0],[0,0,0,0],[-1,-1,-1,-1,-1]]

        int n = triangle.size();
        int[] dp = new int[n];

        for(int i = 0; i < n; i++){
            dp[i] = triangle.get(n-1).get(i);
        }

        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                dp[j] = triangle.get(i).get(j) +
                        Math.min(dp[j], dp[j + 1]);
            }
        }
        System.out.println(dp[0]);



//
//
//
//
//
//      First Tried Method But It Doesn't Work For Some test cases
//      It checks top to bottom method it checks which is smaller i or i+1
//      It gives the answer for most of the test cases but not the efficient for every problem





        // int pathSum=0;
        // int idx=0;
        // int min=Integer.MAX_VALUE;

        // for(int i=0;i<triangle.getLast().size();i++){
        //     if(min>triangle.getLast().get(i)){
        //         min=triangle.getLast().get(i);
        //         idx=i;
        //     }
        // }
        // if(triangle.size()==2){
        //     int sum1=triangle.getLast().get(0)+triangle.get(0).get(0);
        //     int sum2=triangle.getLast().get(1)+triangle.get(0).get(0);
        //     // if(triangle.getLast().get(0)<triangle.getLast().get(1))
        //     //     pathSum+=triangle.getLast().get(0);
        //     // else
        //     //     pathSum+=triangle.getLast().get(1);
        //     pathSum+=Math.min(sum1,sum2);
        //     return pathSum;
        // }
        // if(triangle.getLast().size()-1==idx){
        //     for(int i=triangle.size()-1;i>0;i--){
        //         pathSum+= triangle.get(i).get(idx--);

        //     }
        //         pathSum+=triangle.get(0).get(0);
        //         // System.out.println(pathSum);
        //         return pathSum;
        // }
        // else if(idx==0){
        //     for(int i=triangle.size()-1;i>=0;i--){
        //         pathSum+= triangle.get(i).get(0);

        //     }
        //         pathSum=triangle.get(0).get(0);
        //         // System.out.println(pathSum);
        //         return pathSum;
        // }
        // else{
        //     for (int i = triangle.size() - 1; i > 0; i--) {
        //         int sum1 = triangle.get(i).get(idx) + min;
        //         int sum2 = triangle.get(i).get(idx - 1) + min;
        //         if (sum1 > sum2) {
        //             pathSum += triangle.get(i).get(idx - 1);
        //             idx--;
        //         } else {
        //             pathSum += triangle.get(i).get(idx);
        //         }
        //     }

        //     // System.out.println(pathSum);
        // }
        // pathSum += triangle.get(0).get(0);
        // return pathSum;

    }
}
