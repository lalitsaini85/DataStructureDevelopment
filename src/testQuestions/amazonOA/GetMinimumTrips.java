package testQuestions.amazonOA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/12/2023
 * Time: 2:12 PM
 * File Name : GetMinimumTrips.java
 */
public class GetMinimumTrips {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(1);
        list.add(1);
//        list.add(4);
//        list.add(2);
//        list.add(6);
        System.out.println(getMinimumTrips(list));
    }

    public static int getMinimumTrips(List<Integer> weights) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < weights.size(); i++) {
            if (!map.containsKey(weights.get(i))) {
                map.put(weights.get(i), 1);
            } else {
                map.put(weights.get(i), map.get(weights.get(i)) + 1);
            }
        }
        int cnt = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 == 0 || e.getValue() % 3 == 0) {
                if (e.getValue() % 2 == 0 && e.getValue() % 3 == 0) {
                    cnt += e.getValue() / 3;
                } else if (e.getValue() % 2 == 0 && e.getValue() % 3 != 0) {
                    cnt += e.getValue() / 2;
                } else if (e.getValue() % 3 == 0 && e.getValue() % 2 != 0) {
                    cnt += e.getValue() / 3;
                }
            } else {
                return -1;
            }
        }
        return cnt;
    }
}
