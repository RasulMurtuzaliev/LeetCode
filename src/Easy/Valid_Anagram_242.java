package Easy;

public class Valid_Anagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Valid_Anagram_242 validAnagram242 = new Valid_Anagram_242();
        System.out.println(validAnagram242.isAnagram("anagram", "amargan"));
    }
}
//time complexity: O(n)
//space complexity: O(1)