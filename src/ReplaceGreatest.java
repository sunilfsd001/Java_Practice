class RepalceGreatest{
    public static void main(String[] args){
        int[] arr={17,18,5,4,6,1};
        RepalceGreatest obj=new RepalceGreatest();
        int[] result=obj.replaceElements(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
    public int[] replaceElements(int[] arr) {
        int maxNum=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            int temp=arr[i];
            arr[i]=maxNum;
            if(temp>maxNum){
                maxNum=temp;
            }
        }
        return arr;
    }
}