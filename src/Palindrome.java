public class Palindrome {
    public static void main(String[] args){
        String s="malayalam";
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
