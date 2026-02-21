import java.util.*;
public class PermutationString {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the String : ");
        String s2= scan.nextLine();
        System.out.print("Enter the String : ");
        String s1= scan.nextLine();
        System.out.println("The String found:"+checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int[] s1feq=new int[26];
        int[] curfeq=new int[26];

        for(char c:s1.toCharArray())
            s1feq[c-'a']++;

        for(int i=0;i<s2.length();i++){
            curfeq[s2.charAt(i)-'a']++;

            if(i>s1.length()-1){
                curfeq[s2.charAt(i-s1.length())-'a']--;
            }

            if(Arrays.equals(s1feq,curfeq)){
                return true;
            }

        }
        return false;
    }
}
