package Easy.Prefix_Sum;

public class Find_the_Highest_Altitude_1732 {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int sumAltitude = 0;

        for (int g : gain) {
            sumAltitude += g;
            maxAltitude = Math.max(maxAltitude, sumAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Find_the_Highest_Altitude_1732 example = new Find_the_Highest_Altitude_1732();
        System.out.println(example.largestAltitude(new int[]{1, 2, -3, 4}));
    }
}
//time complexity: O(n)
//space complexity: O(1)