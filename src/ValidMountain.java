class ValidMountain{

    public static void main(String[] args) {
        int[] arr={0,3,2,1};
        System.out.println(validMountainArray(arr));
    }

    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)return false;

        int left=0;
        int right=arr.length-1;
        while(arr[left]<arr[left+1] && left<right-1){
            left++;
        }
        while(arr[right-1]>arr[right] && right>1){
            right--;
        }
        return (right==left)?true:false;


        // int index=0;

        // for(int i=1;i<arr.length;i++){
        //     if(arr[i-1]>arr[i]){
        //         index=i-1;
        //         break;
        //     }
        // }
        // for(int i=index+1;i<arr.length;i++){
        //     if(arr[i-1]<arr[i]){
        //         return false;
        //     }
        // }
        // return true;



        // int max=Integer.MIN_VALUE;
        // int index=0;
        // for(int i = 0; i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //         index=i;
        //     }
        // }
        // int left=index-1,right=index+1;
        // while(left>=0 && right<arr.length){
        //   if(arr[left]>=arr[left+1] || arr[right]>=arr[right-1])return false;
        //   left--;
        //   right++;
        // }
        // return true;
    }
}