public class Palindrome {
    public static void main(String[] args) {
        int num = 123;

        int num2 = 121;

        System.out.println("Is number a palindrome " + isPalindrome(num));
        System.out.println("Is number a palindrome " + isPalindrome(num2));
    }

    public static boolean isPalindrome(int x){
        String value = String.valueOf(x);
        int start = 0;
        int end = value.length() - 1;

        while(start <= end){
            if(value.charAt(start) != value.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
