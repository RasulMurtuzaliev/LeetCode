package Easy;

import java.util.HashSet;

public class Contains_Duplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Contains_Duplicate_217 containsDuplicate217 = new Contains_Duplicate_217();
        System.out.println(containsDuplicate217.containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 1}));
    }
}
