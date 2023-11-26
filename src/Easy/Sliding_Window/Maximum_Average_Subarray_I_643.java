package Easy.Sliding_Window;

public class Maximum_Average_Subarray_I_643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }
        return (double) max / k;
    }

    public static void main(String[] args) {
        Maximum_Average_Subarray_I_643 example = new Maximum_Average_Subarray_I_643();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 3;
        System.out.println(example.findMaxAverage(nums, k));
    }
}
//time complexity: O(n)
//space complexity: O(1)