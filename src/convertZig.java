import java.util.Arrays;

public class convertZig {
    public static void main(String[] args){
        String s="PAYPALISHIRING";
        int numRows=3;
        System.out.println(convert(s,numRows));
    }
    static String convert(String s, int numRows) {
        if(s.length()<=numRows||numRows<=1)
            return s;
        String[] sArr=new String[numRows];
        Arrays.fill(sArr, "");
        int index=0;
        boolean down=true;
        for(char c:s.toCharArray()){
            sArr[index]+=c;
            if(index==0)
                down=true;
            else if(index==numRows-1)
                down=false;
            index+=down?1:-1;
        }
        String result="";
        for(String st:sArr){
            result+=st;
        }
        return result;
    }
}
