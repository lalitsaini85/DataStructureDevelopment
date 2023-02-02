package concepts.slidingWindow;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 1/31/2023
 * Time: 2:38 PM
 * File Name : PermutationInString.java
 */
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "abc";
        int s1len = 0;
        String s2 = "eiodbado";
        int[] map = new int[26];
        while (s1len < s1.length()) {
            map[s1.charAt(s1len) - 'a']++;
            s1len++;
        }
        int i = 0;
        int j = 0;
        while (j < s2.length()) {

            map[s2.charAt(j) - 'a']--;       //

            if (j - i + 1 < s1.length()) {
                j++;
            } else if (j - i + 1 == s1.length()) {

                if (allZero(map)) {
                    System.out.println("True");
                    return;
                }
                map[s2.charAt(i) - 'a']++;
                i++;
                j++;
            }
        }
        System.out.println("False");
    }

    private static boolean allZero(int[] map) {
        for (int i = 0; i < map.length; i++) {
            if (map[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
