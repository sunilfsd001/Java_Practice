class MinimumChanges {
    static void main(String[] args) {
        String s="00100";
        int count=0;

        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            else{
                if(s.charAt(i)=='0'){
                    count++;
                }
            }
        }
        System.out.println(Math.min(count,s.length()-count));
    }
}
