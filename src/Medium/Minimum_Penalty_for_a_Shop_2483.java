package Medium;

public class Minimum_Penalty_for_a_Shop_2483 {
    public int bestClosingTime(String customers) {
        int maxPoints = 0;
        int currentPoints = 0;
        int bestHour = -1;

        for (int i = 0; i < customers.length(); i++) {
            currentPoints += customers.charAt(i) == 'Y' ? 1 : -1;
            if (currentPoints > maxPoints) {
                maxPoints = currentPoints;
                bestHour = i;
            }
        }
        return bestHour + 1;
    }

    public static void main(String[] args) {
        Minimum_Penalty_for_a_Shop_2483 example = new Minimum_Penalty_for_a_Shop_2483();
        System.out.println(example.bestClosingTime("YYNYNY"));
    }
}
//time complexity: O(n)
//space complexity: O(1)