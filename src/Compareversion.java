import java.util.*;
class Compareversion{
    public static void main(String[] args) {
        String v1="1.2";
        String v2="1.00010";
        System.out.println(compareVersion1(v1,v2));
        System.out.println(compareVersion2(v1,v2));
    }

    static int compareVersion2(String version1, String version2) {
        int v1Size=version1.length();
        int v2Size=version2.length();

        int i=0,j=0;

        while(i<v1Size || j<v2Size){
            int v1=0,v2=0;
            while(i<v1Size && version1.charAt(i)!='.'){
                v1=v1*10+version1.charAt(i)-'0';
                i++;
            }
            while(j<v2Size && version2.charAt(j)!='.'){
                v2=v2*10+version2.charAt(j)-'0';
                j++;
            }
            if(v1<v2) return -1;
            else if(v1>v2) return 1;

            i++;
            j++;
        }
        return 0;
    }


    static int compareVersion1(String version1, String version2) {
        List<Integer> v1 = splitNum(version1);
        List<Integer> v2 = splitNum(version2);
        if (v1.size() < v2.size()) {
            for (int i = v1.size(); i < v2.size(); i++) {
                v1.add(0);
            }
        } else if (v1.size() > v2.size()) {
            for (int i = v2.size(); i < v1.size(); i++) {
                v2.add(0);
            }
        }
        for (int i = 0; i < v1.size(); i++) {
            if (v1.get(i) < v2.get(i)) {
                return -1;
            } else if (v1.get(i) > v2.get(i)) {
                return 1;
            }
        }
        return 0;
    }

    static List<Integer> splitNum(String v) {
        String[] splited = v.split("\\.");
        List<Integer> list = new ArrayList<>();
        for (String s : splited) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }
}
