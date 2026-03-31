class IsomorphicString{
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        int[] sBox=new int[256];
        int[] tBox=new int[256];
        for(int i=0;i<s.length();i++){
            char sCh= s.charAt(i);
            char tCh= t.charAt(i);
            if(sBox[sCh]!=tBox[tCh])
                return false;
            sBox[sCh]=i+1;
            tBox[tCh]=i+1;
        }
        return true;

        // Map<Character,Character> map=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     map.putIfAbsent(s.charAt(i),t.charAt(i));
        //     if(map.get(s.charAt(i))!=t.charAt(i))
        //         return false;
        // }
        // return true;
    }
}