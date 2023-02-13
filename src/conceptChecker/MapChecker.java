package conceptChecker;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/13/2023
 * Time: 8:48 PM
 * File Name : MapChecker.java
 */
public class MapChecker {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('a', 1);
        map.put('a', map.get('a') - 1);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.values());
    }
}
