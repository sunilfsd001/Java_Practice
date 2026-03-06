public class ReverseString {
    public static void main(String[] args){
        String s="JAVA PROGRAMING";
        System.out.println(reverse(s));
    }
    static String reverse(String s){
        if(s.length()==1)return s.substring(0,1);
        char lastLetter=s.charAt(s.length()-1);
        return lastLetter+reverse(s.substring(0,s.length()-1));
    }
}
