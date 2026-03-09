public class FirstOccurrence {
    static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="sad";
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
