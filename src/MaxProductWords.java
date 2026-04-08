import java.util.*;

class MaxProductWords {
    public static void main(String[] args) {
        MaxProductWords mpw = new MaxProductWords();
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        int result = mpw.maxProduct(words);
        System.out.println(result);
    }
    public int maxProduct(String[] words) {

        int max=0;
        int len=words.length;
        String[] secWords=new String[len];


//      The idea is to create a new array secWords where each element is a string containing the unique characters of the corresponding word in the input array words.
//      This allows us to easily check for common characters between pairs of words by comparing their corresponding elements in secWords.

        for(int i=0;i<len;i++){
            Set<Character> set = new HashSet<>();  
            for(char ch:words[i].toCharArray()){
                set.add(ch);
            }  
            StringBuilder str=new StringBuilder();
            for(char a:set){
                str.append(a);
            }    
            secWords[i]=str.toString();
        }

//      The next step is to iterate through all pairs of words in the input array and check if they have any common characters by comparing their corresponding elements in secWords.
//      If they do not have any common characters, we calculate the product of their lengths and update the maximum product found so far. 


        for(int i=0;i<len-1;i++){
            int wordLen=words[i].length();
            for(int j=i+1;j<len;j++){
                int curLen=words[j].length();
                boolean isHaving=false;
                for(char a:secWords[j].toCharArray()){
                    if(secWords[i].indexOf(a)!=-1){
                        isHaving=true;
                        break;
                    }
                }
                if(!isHaving){
                    max=Math.max(max,wordLen*curLen);
                }
            }
        } 
        return max;


//      The time complexity of this solution is O(n^2 * m), where n is the number of words and m is the average length of the words.
//      This is because we need to compare each pair of words and check for common characters, which takes O(m) time in the worst case.
//      The space complexity is O(n * m) due to the additional array secWords that stores the unique characters for each word.



//      An alternative approach to solve this problem is to use bit manipulation to represent the characters in each word as a bitmask.
//      This allows us to efficiently check for common characters between pairs of words by performing a bitwise AND operation on their corresponding bitmasks.
//      The time complexity of this approach is O(n^2) for comparing pairs of words, and the space complexity is O(n) for storing the bitmasks.

        // int n = words.length;
        // int[] masks = new int[n];
        // for (int i = 0; i < n; i++) {
        //     for (char c : words[i].toCharArray()) {
        //         masks[i] |= 1 << (c - 'a');
        //     }
        // }
        // int maxProduct = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if ((masks[i] & masks[j]) == 0) {
        //             maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
        //         }
        //     }
        // }
        // return maxProduct;
    }
}