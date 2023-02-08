package testQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/8/2023
 * Time: 4:46 PM
 * File Name : GetApplications.java
 */
public class GetApplications {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("open firefox"); // open command means add to the list;
        list.add("open a");
        list.add("clear");      // clear command means clear the list;
        list.add("open b");
        list.add("open f");
        list.add("open curl");
        list.add("close 1");      // close command mean remove recently used k items here k = 1;
        System.out.println(getApplications(list));
    }

    public static List<String> getApplications(List<String> commands) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < commands.size(); i++) {
            String[] s = commands.get(i).split(" ");
            System.out.println(s[1]);
            if (s[0].equals("open")) {
                list.add(s[1]);
            }
            if (s[0].equals("clear")) {
                list.clear();
            }
            if (s[0].equals("close")) {
                int n = Integer.parseInt(s[1]);
                if (n >= list.size()) {
                    list.clear();
                } else {
                    while (n-- > 0) {
                        String str = list.get(list.size() - 1);
                        list.remove(str);
                    }
                }
            }
        }
        return list;

    }
}
