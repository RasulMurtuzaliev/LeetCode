package Easy.Data_Structures;

public class Single_Number_136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Single_Number_136 singleNumber136 = new Single_Number_136();
        System.out.println(singleNumber136.singleNumber(new int[]{1, 4, 1, 2, 12, 7, 2, 4, 12}));
    }
}
//time complexity: O(n)
//space complexity: O(1)