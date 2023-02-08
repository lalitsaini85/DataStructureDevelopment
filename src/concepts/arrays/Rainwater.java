package concepts.arrays;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/8/2023
 * Time: 12:20 PM
 * File Name : Rainwater.java
 */
public class Rainwater {         // Using array preprocessing technique.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Trapped water: " + rainwaterTrapped(n, arr));
    }

    private static int rainwaterTrapped(int n, int[] arr) {
        int[] left = new int[n];
        int[] right = new int[n];
        int res = 0;
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            if (left[i - 1] < arr[i]) {
                left[i] = arr[i];
            } else {
                left[i] = left[i - 1];
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (right[i + 1] < arr[i]) {
                right[i] = arr[i];
            } else {
                right[i] = right[i + 1];
            }
        }
        for (int i = 0; i < n; i++) {
            res += Math.min(left[i], right[i]) - arr[i];
        }
        return res;
    }
}
