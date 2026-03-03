import java.util.*;
public class Compareversion{
    public static void main(String[] args) {
        String v1="1.01";
        String v2="1.0001";
        System.out.println(compareVersion(v1,v2));
    }

    static public int compareVersion(String version1, String version2) {
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
