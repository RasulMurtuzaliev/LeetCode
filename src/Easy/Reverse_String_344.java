package Easy;

public class Reverse_String_344 {
    public void reverseString1(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = tmp;
        }
        System.out.println(s);
    }

    public void reverseString2(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Reverse_String_344 reverse1 = new Reverse_String_344();
        String s1 = "olleH";
        reverse1.reverseString1(s1.toCharArray());

        Reverse_String_344 reverse2 = new Reverse_String_344();
        String s2 = "!dlroW";
        reverse2.reverseString2(s2.toCharArray());
    }
}
//time complexity: O(n)
//space complexity: O(1)