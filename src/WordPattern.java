import java.util.*;
class WordPattern{
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
    static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (words.length != pattern.length()) return false;

        for (int i = 0; i < words.length; i++) {
            if (pattern.indexOf(pattern.charAt(i)) != Arrays.asList(words).indexOf(words[i])) {
                return false;
            }
        }
        return true;
    }
}