/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */



    
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        // 1. Find peak
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int peak = start;

        // 2. Search increasing side
        int ans = binarySearchAscending(
            mountainArr, target, 0, peak
        );

        if (ans != -1) {
            return ans;
        }

        // 3. Search decreasing side
        return binarySearchDescending(
            mountainArr, target, peak + 1, n - 1
        );
    }

    // Increasing order
    private int binarySearchAscending(
        MountainArray arr, int target, int start, int end
    ) {
        while (start <= end) {

            int mid = start + (end - start) / 2;
            int value = arr.get(mid);

            if (value == target) {
                return mid;
            } 
            else if (value < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // Decreasing order
    private int binarySearchDescending(
        MountainArray arr, int target, int start, int end
    ) {
        while (start <= end) {

            int mid = start + (end - start) / 2;
            int value = arr.get(mid);

            if (value == target) {
                return mid;
            } 
            else if (value > target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}