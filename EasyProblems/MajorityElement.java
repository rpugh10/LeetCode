
import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int[] values){
        Arrays.sort(values);
        int n = values.length;
        return values[n/2]; //returns the value in the middle of the array
    }
}
