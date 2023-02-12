package testQuestions.amazonOA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/12/2023
 * Time: 2:50 PM
 * File Name : ImplementAPI.java
 */
public class ImplementAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("register david david123");
        list.add("register adam 1Adam1");
        list.add("login david david123");
        list.add("login adam 1adam1");
        list.add("logout david");
        System.out.println(implementAPI(list));
    }

    public static List<String> implementAPI(List<String> logs) {
        HashMap<String, String[]> hm = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();

        int n = logs.size();

        for (int i = 0; i < n; i++) {
            String s = logs.get(i);
            String inp[] = s.split(" ");
            String type = inp[0];
            String uname = inp[1];
            String pass = inp.length == 3 ? inp[2] : "";

            if (type.equals("register")) {
                if (hm.containsKey("uname")) {
                    ans.add("Username already exists");
                } else {
                    hm.put(uname, new String[]{pass, "0"});
                    ans.add("Registered Successfully");
                }
            } else if (type.equals("login")) {
                if (!hm.containsKey(uname)) {
                    ans.add("Login Unsuccessful");
                } else {
                    String curr[] = hm.get(uname);

                    if (curr[1].equals("1") || !curr[0].equals(pass)) {
                        ans.add("Login Unsuccessful");
                    } else {
                        hm.put(uname, new String[]{curr[0], "1"});
                        ans.add("Logged In Successfully");
                    }
                }
            } else if (type.equals("logout")) {
                if (!hm.containsKey(uname)) {
                    ans.add("Logout Unsuccessful");
                } else {
                    String curr[] = hm.get(uname);
                    if (curr[1].equals("0")) {
                        ans.add("Logout Unsuccessful");
                    } else {
                        String curr1[] = hm.get(uname);
                        if (curr1[1].equals("0")) {
                            ans.add("Logout Unsuccessful");
                        } else {
                            hm.put(uname, new String[]{curr1[0], "0"});
                            ans.add("Logout Successful");
                        }
                    }
                }
            }
        }
        return ans;
    }
}
