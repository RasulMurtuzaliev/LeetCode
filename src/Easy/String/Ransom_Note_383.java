package Easy.String;

public class Ransom_Note_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Ransom_Note_383 ransomNote383 = new Ransom_Note_383();
        System.out.println(ransomNote383.canConstruct("a", "b"));
        System.out.println(ransomNote383.canConstruct("aa", "ab"));
        System.out.println(ransomNote383.canConstruct("aa", "aab"));
    }
}
//time complexity: O(n)
//space complexity: O(1)
