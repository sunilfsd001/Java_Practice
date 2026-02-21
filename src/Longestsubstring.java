import java.util.*;
public class Longestsubstring {
    public static void main(String[] args) {
        System.out.print("Enter the String to find :");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Length Of Longest Substring :" + lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left) {
                left = map.get(s.charAt(right)) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            map.put(s.charAt(right), right);
        }
        return maxLength;
    }
}
