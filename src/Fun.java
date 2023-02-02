/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 25-02-2022
 * Time: 19:55
 * File Name : Fun.java
 */
public class Fun {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);

    }

    public static int stair(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return (stair(n - 1) + stair(n - 2));
    }

    public static void printDec(int n) {
        if (n == 0) {
            return;
        }
        //System.out.println(n);
        printDec(n - 1);
        System.out.println(n);
        return;
    }

    public static void main(String[] args) {

        //printDec(5);
        System.out.println(stair(3));

    }
}
