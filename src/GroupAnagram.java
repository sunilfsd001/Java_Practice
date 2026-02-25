import java.util.*;
public class GroupAnagram {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size= scan.nextInt();
        scan.nextLine();
        String[] strs=new String[size];
        for(int i=0;i<size;i++){
            strs[i]=scan.nextLine();
        }
        System.out.println(groupAnagrams(strs));
    }
    static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

//        DP Method

        // for(String s:strs){
        //     int[] dp=new int[26];
        //     for(char c:s.toCharArray()){
        //         dp[c-'a']++;
        //     }
        //     String key=Arrays.toString(dp);
        //     map.putIfAbsent(key,new ArrayList());
        //     map.get(key).add(s);
        // }
        // return new ArrayList(map.values());


        for(String s:strs){
            char[] word=s.toCharArray();
            Arrays.sort(word);
            String sorted=new String(word);
            map.putIfAbsent(sorted,new ArrayList());
            map.get(sorted).add(s);
        }
        return new ArrayList(map.values());

    }
}
