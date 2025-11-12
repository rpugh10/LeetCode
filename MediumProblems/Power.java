
import java.util.Scanner;

public class Power {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a double: ");
        double input = scan.nextDouble();
        System.out.println("Enter an integer: ");
        int value = scan.nextInt();

        System.out.println("The number " + input + " to the power " + value + " is " + myPow(input, value));
    }

    public static double myPow(double x, int n){
        return Math.pow(x, n);
    }
}
