import java.util.*;

public class ReverseVowel {
    public static void main(String[] args){
        String s="Sunil";
        System.out.println(reverseVowels(s));
    }
    static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left=0,right=arr.length-1;
        while(left<right){
            while(left<right && !isVowel(arr[left])){
                left++;
            }
            while(left<right && !isVowel(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);

    }
    static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}
