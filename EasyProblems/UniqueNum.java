public class UniqueNum {

    public static void main(String[] args) {
        int numbers[] = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[4] = 3;
        numbers[5]  = 1;
        numbers[6] = 4;
        numbers[7] = 4;
        numbers[8] = 5;
        numbers[9] = 5;

        System.out.println("Unique number " + uniqueNumber(numbers));
    }

    public static int uniqueNumber(int nums[]){
        int value = 0;

        for(int i = 0; i < nums.length; i++){
            value ^= nums[i];
        }
        return value;
    }
}
