import java.util.*;

class FindWordsContain{
    public static void main(String[] args) {
        String[] words = {"hello", "world", "java", "python"};
        String search = "o";
        FindWordsContain finder = new FindWordsContain();
        List<Integer> result = finder.findWordsContaining(words, search.charAt(0));
        System.out.println(result);
    }
    
    public List<Integer> findWordsContaining(String[] words, char x) {
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<words.length;i++){
        if(words[i].indexOf(x)!=-1){
            list.add(i);
        }
    }
    return list;
}
}