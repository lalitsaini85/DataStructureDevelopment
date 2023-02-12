package testQuestions.amazonOA;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/12/2023
 * Time: 3:27 PM
 * File Name : DataLocations.java
 */
public class DataLocations {
    public static void main(String[] args) {
        List<Integer> loc = new ArrayList<>();
        List<Integer> movf = new ArrayList<>();
        List<Integer> movt = new ArrayList<>();
        loc.add(1);
        loc.add(7);
        loc.add(6);
        loc.add(8);
        movf.add(1);
        movf.add(7);
        movf.add(2);
        movt.add(2);
        movt.add(9);
        movt.add(5);
        System.out.println(findDataLocations(loc, movf, movt));
    }

    public static List<Integer> findDataLocations(List<Integer> locations, List<Integer> movedFrom, List<Integer> movedTo) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < locations.size(); i++) {
            map.put(locations.get(i), locations.get(i));
        }
        for (int i = 0; i < movedFrom.size(); i++) {
            map.put(movedTo.get(i), movedFrom.get(i));
            map.remove(movedFrom.get(i));
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            ans.add(e.getKey());
        }
        Collections.sort(ans);
        return ans;
    }
}
