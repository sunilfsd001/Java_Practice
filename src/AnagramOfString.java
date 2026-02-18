import java.util.*;
public class AnagramOfString {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s=scan.nextLine();
        System.out.print("Enter the Anagram String :");
        String p=scan.nextLine();
        System.out.println(findAnagrams(s,p));

    }
    static List<Integer> findAnagrams(String s, String p) {
        s=s.toLowerCase();
        List<Integer> result=new ArrayList<>();
        int[] pcount=new int[26],wcount=new int[26];

        for(char c:p.toCharArray())
            pcount[c-'a']++;

        for(int i=0;i<s.length();i++){
            wcount[s.charAt(i)-'a']++;

            if(i>=p.length())
                wcount[s.charAt(i-p.length())-'a']--;

            if(Arrays.equals(pcount,wcount))
                result.add(i-p.length()+1);
        }
        return result;
    }
}
