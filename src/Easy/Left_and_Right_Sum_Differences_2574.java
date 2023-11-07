package Easy;

import java.util.Arrays;

public class Left_and_Right_Sum_Differences_2574 {
    public int[] leftRightDifference(int[] nums) {
        int size = nums.length;

        int[] leftSum = new int[size];
        for (int i = 1; i < size; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        int[] rightSum = new int[size];
        for (int i = size - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        int[] answer = new int[size];
        for (int i =0; i<size; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Left_and_Right_Sum_Differences_2574 example = new Left_and_Right_Sum_Differences_2574();
        System.out.println(Arrays.toString(example.leftRightDifference(new int[]{10, 4, 8, 3})));
    }
}
//time complexity: O(n)
//space complexity: O(n)
