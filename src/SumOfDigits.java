public class SumOfDigits {
    public static void main(String[] args){
        int digit=1054897;
        System.out.println(sumOfDigit(digit));
    }
    static int sumOfDigit(int num){
        if(num==0)return 0;
        return num%10 +(sumOfDigit(num/10));
    }
}
