import java.util.*;
class Kthlargest{
    public static void main(String[] args){
        int[] nums={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(nums,k));
    }
    static int findKthLargest(int[] nums, int k) {

        PriorityQueue <Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int n: nums){
            maxHeap.add(n);
        }
        for(int count=1;count<k;count++){
            maxHeap.poll();
        }
        return maxHeap.peek();

    // while(k > 0){

    //     int max = Integer.MIN_VALUE;
    //     int idx = -1;

    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i] > max){
    //             max = nums[i];
    //             idx = i;
    //         }
    //     }

    //     nums[idx] = Integer.MIN_VALUE;
    //     k--;

    //     if(k == 0) return max;
    // }

    // return -1;
    }
}