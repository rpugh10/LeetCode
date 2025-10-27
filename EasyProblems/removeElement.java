
import java.util.Arrays;
import java.util.Scanner;


public class removeElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");

        for(int i =0; i < numbers.length; i++){
            int value = scan.nextInt();
            numbers[i] = value;
        }
        System.out.println(Arrays.toString(numbers));
        
        System.out.println("Enter a value to remove: ");
        int numToRemove = scan.nextInt();

        System.out.println("Number of valid numbers: " + removeElements(numbers, numToRemove));
    }

    public static int removeElements(int[] nums, int val){
        int front = 0;
        int end = nums.length - 1;

        while(front <=end){
            if(nums[front] == val){
                int temp = nums[front];
                nums[front] = nums[end];
                nums[end] = temp;
                end--;
            }
            else{
                front++;
            }
        }
        return end + 1;
    }
}
