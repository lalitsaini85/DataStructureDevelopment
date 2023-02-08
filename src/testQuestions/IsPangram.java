package testQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/8/2023
 * Time: 4:51 PM
 * File Name : IsPangram.java
 */
public class IsPangram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abash fkgsdah fjasdbf");
        list.add("abcdefghijknlmohptgbqwertexzcdfgjbla  rhiuhsdb");
        list.add("abcdefgh ijklmno pqrstuvwxyz abdcdfljkghskj");
        System.out.println(isPangram(list));
    }

    public static String isPangram(List<String> pangram) {
        String res = "";

        for (int i = 0; i < pangram.size(); i++) {
            int[] arr = new int[26];
            String s = pangram.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    continue;
                }
                arr[s.charAt(j) - 'a']++;
            }
            int cnt = 0;
            for (int k = 0; k < 26; k++) {
                if (arr[k] == 0) {
                    res += "0";
                    cnt++;
                    break;
                }
            }
            if (cnt == 0) {
                res += "1";
            }

        }
        return res;
    }
}
