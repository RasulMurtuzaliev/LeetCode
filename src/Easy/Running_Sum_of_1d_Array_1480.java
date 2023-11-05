package Easy;

import java.util.Arrays;

public class Running_Sum_of_1d_Array_1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Running_Sum_of_1d_Array_1480 runningSum1480 = new Running_Sum_of_1d_Array_1480();
        System.out.println(Arrays.toString(runningSum1480.runningSum(new int[]{1, 2, 3, 4})));
    }
}
