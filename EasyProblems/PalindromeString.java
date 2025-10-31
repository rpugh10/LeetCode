
import java.util.Scanner;

public class PalindromeString {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scan.nextLine();

        System.out.println("String is a palindrome: " + isPalindrome(input));
    }

    public static boolean isPalindrome(String s){
        String input = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0;
        int end = input.length() - 1;

        while(start <= end){
            if(input.charAt(start) != input.charAt(end)){
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
