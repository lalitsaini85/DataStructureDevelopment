/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/6/2023
 * Time: 1:29 PM
 * File Name : RecursionOfMain.java
 */
public class RecursionOfMain {
    static int i = 1;

    public static void main(String[] args) {
        if (i > 5) {
            return;
        }
        System.out.println("Hello");

        i++;
        main(args);

    }
}
