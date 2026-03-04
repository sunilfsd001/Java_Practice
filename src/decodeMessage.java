import java.util.*;
public class decodeMessage {
    public static void main(String[] args){
        String key="the quick brown fox jumps over the lazy dog";
        String message="vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));
    }
    static String decodeMessage(String key, String message) {
        String result="";
        Map<Character,Character> map=new HashMap<>();
        map.put(' ',' ');
        char ch=97;
        key=key.toLowerCase();
        for(int i=0;i<key.length();i++){
            if(!map.containsKey(key.charAt(i)))
                map.put(key.charAt(i),ch++);
        }
        for(int i=0;i<message.length();i++){
            if(map.containsKey(message.charAt(i))){
                result+=map.get(message.charAt(i));
            }
        }
        return result;
    }
}
