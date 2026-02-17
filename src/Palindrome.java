class Palindrome {

//    Valid palindrome:Check if a string  reads the same forward and backward.


    public static void main(String[] args){
        String s="sunilinus";
        System.out.println(checkPalindrome(s));
    }
    static boolean checkPalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
