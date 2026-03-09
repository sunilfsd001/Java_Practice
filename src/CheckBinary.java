public class CheckBinary {
    static void main(String[] args) {
        String s="1001";
        int f=s.indexOf("1");
        int l=s.lastIndexOf("1");
        String str=s.substring(f,l+1);
        for(int i=f;i<l;i++){
            if(str.charAt(i)=='0') System.out.println(false);
        }
        System.out.println(true);
    }
}
