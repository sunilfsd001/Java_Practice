public class prefixString {
    public static void main(String[] args){
        String[] strs={"flower","flew","fly"};
        System.out.println(longestCommonPrefix1(strs));
        System.out.println(longestCommonPrefix2(strs));
    }
    static String longestCommonPrefix1(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())return "";
            }
        }
        return prefix;
    }
    static String longestCommonPrefix2(String[] strs){
         String prefix=strs[0];
         for(String s:strs){
             String res="";
             for(int i=0;i<Math.min(prefix.length(),s.length());i++){
                 if(prefix.charAt(i)==s.charAt(i)){
                     res+=s.charAt(i);
                 }
                 else break;
             }
             prefix=res;
         }
         return prefix;
    }
}
