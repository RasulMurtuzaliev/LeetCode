package Easy;

public class Find_Pivot_Index_724 {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Find_Pivot_Index_724 example = new Find_Pivot_Index_724();
        System.out.println(example.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
//time complexity: O(n)
//space complexity: O(1)