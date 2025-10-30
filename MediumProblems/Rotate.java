
import java.util.Arrays;

public class Rotate {

    public static void main(String[] args) {
        int num[] = new int[6];
        
        for(int i = 0; i < num.length; i++){
            num[i] = i;
        }

        System.out.println("Before shift " + Arrays.toString(num));
        int shift = 4;

        rotateArray(num, shift);
        
        System.out.println("After shift " + Arrays.toString(num));
    }

    public static void rotateArray(int array[], int k){
        k = k % array.length;
        int temp[] = new int[array.length];

        for(int i = 0; i < array.length; i++){
            temp[(i + k) % array.length] = array[i];
        }

        for(int i = 0; i < array.length; i++){
            array[i] = temp[i];
        }
    }
}
