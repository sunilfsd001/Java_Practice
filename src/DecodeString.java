public class DecodeString {
    int index = 0;

    public static void main(String[] args) {
        String s = "2[abc]3[cd]efg";
        DecodeString h = new DecodeString();
        System.out.println(h.helper(s));
    }

    public String helper(String s) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        while (index < s.length()) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                index++;
                String inner = helper(s);

                for (int i = 0; i < num; i++) {
                    result.append(inner);
                }
                num = 0;
            } else if (c == ']') {
                return result.toString();
            } else {
                result.append(c);
            }

            index++;
        }

        return result.toString();
    }
}
