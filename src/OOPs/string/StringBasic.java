package OOPs.string;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/2/2023
 * Time: 5:15 PM
 * File Name : StringBasic.java
 */
public class StringBasic {
    public static void main(String[] args) {
        String str = "name";
        String str1 = "name";    // both variables are pointing to same memory location.

        str = "John";      // str only pointing to john memory location there is nothing changed with name memory location.
    }
}
