package Easy.Data_Structures;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numAndIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numAndIndex.containsKey(diff)) {
                return new int[]{numAndIndex.get(diff), i};
            }
            numAndIndex.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Two_Sum_1 example = new Two_Sum_1();
        int[] result = example.twoSum(new int[]{3, 2, 4, 5}, 6);
        System.out.println(result[0] + " " + result[1]);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)