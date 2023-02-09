package concepts.binarySearch;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/9/2023
 * Time: 9:53 PM
 * File Name : SearchRange.java
 */
public class SearchRange { //34. Find First and Last Position of Element in Sorted Array.
    int[] arr = new int[2];

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        arr[0] = nums.length;
        arr[1] = -1;
        if (nums.length == 0) {
            return ans;
        }
        int low = 0;
        int high = nums.length - 1;
        search(nums, low, high, target);
        if (arr[1] != -1) {
            return arr;
        }

        return ans;
    }

    public void search(int[] nums, int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                arr[0] = Math.min(arr[0], mid);  // If current value in arr[0] is less than mid.
                arr[1] = Math.max(arr[1], mid);  // If current value in arr[1] is greater than mid.
                search(nums, low, mid - 1, target); // check If target is also present before mid.
                search(nums, mid + 1, high, target);  //check If target is also present after mid.

            } else if (target < nums[mid]) {
                high = mid - 1;
                search(nums, low, high, target);
            } else {
                low = mid + 1;
                search(nums, low, high, target);
            }
        }
    }
}
