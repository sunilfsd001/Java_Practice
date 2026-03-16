class DefangIP{
    public static void main(String[] args) {
        DefangIP defangIP=new DefangIP();
        String address="255.100.50.0";
        System.out.println(defangIP.defangIPaddr(address));
    }
 public String defangIPaddr(String address) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                result.append("[.]");
            }
            else{
                result.append(address.charAt(i));
            }
        }
        return result.toString();
    }   
}