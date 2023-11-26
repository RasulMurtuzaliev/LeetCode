package Medium.Sliding_Window;

import java.util.Arrays;

public class Frequency_of_the_Most_Frequent_Element_1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            int target = nums[right];
            sum += target;

            int targetSum = target * (right - left + 1);

            if (targetSum - sum > k) {
                sum -= nums[left];
                left++;
            }
        }
        return nums.length - left;
    }

    public static void main(String[] args) {
        Frequency_of_the_Most_Frequent_Element_1838 example = new Frequency_of_the_Most_Frequent_Element_1838();
        int[] nums = {1, 2, 4, 5};
        int k = 5;
        System.out.println(example.maxFrequency(nums, k));
    }
}
//time complexity: O(nlogn)
//space complexity: O(1)