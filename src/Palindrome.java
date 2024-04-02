public class Palindrome {
    static boolean checkPalindrome(int x){
        int y=x;
        int temp=0;
        while(x>0){
            temp=temp*10+x%10;
            x/=10;
        }
        return temp==y;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome(4554));
        System.out.println(checkPalindrome(45545));
    }
}
