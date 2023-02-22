package sorting;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/22/2023
 * Time: 10:19 PM
 * File Name : MergeSort.java
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scn.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        sort(array);
        System.out.print("After sorting: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] array) {
        if (array.length == 1) { // base case
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];     // Store left elements from the mid
        int[] right = new int[array.length - mid];  // Store right elements from the mid
        int i;
        for (i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[i];
            i++;
        }
        sort(left);           // First left recursion call has to be completed
        sort(right);          // After left recursion call goes to right recursion call.
        merge(left, right, array);  // merge left and right arrays into main arrays with sorting values.
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int nl = left.length;
        int nr = right.length;
        int i = 0, j = 0, k = 0;
        while (i < nl && j < nr) {
            if (left[i] < right[j]) {       // compare values in both left and right arrays.
                array[k] = left[i];
                i++;
                k++;
            } else {
                array[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < nl) {          // If any element left in left array.
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < nr) {       // If any element left in right array.
            array[k] = right[j];
            j++;
            k++;
        }

    }
}
