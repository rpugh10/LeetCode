public class MinLength {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        //This value is imposible for a subarray length
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        for(int right = 0; right < nums.length; right++){
             sum += nums[right];

            while(sum >= target){

                minLength = Math.min(minLength, right - left + 1);

                int valueToRemove = nums[left];
                sum -= valueToRemove;
                left++;
            }
        }

        //Check to see if minLength was changed or not
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }

        return minLength;

    }
}
