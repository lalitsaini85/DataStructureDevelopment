package concepts.slidingWindow;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 1/31/2023
 * Time: 2:08 PM
 * File Name : MaxSumSubarraySizeK.java
 */
public class MaxSumSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 10, 9, 8};
        int i = 0;
        int j = 0;
        int n = arr.length;
        int k = 3;
        int sum = 0;
        int max = sum;
        /*while(j-i+1 <= k){        // -- Method One in Two loop
            sum += arr[j];
            j++;
        }
        max = sum;
        while(j < n){
            sum -= arr[i];
            i++;
            sum+=arr[j];
            j++;
            max = Math.max(max,sum);
        }*/

        // Method 2 in single loop
        while (j < n) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);

    }
}
