
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        // Pair each number with its index
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort in descending order based on value
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // Select top k elements
        int[][] topK = Arrays.copyOf(arr, k);

        // Sort the top k elements by their original index to maintain order
        Arrays.sort(topK, Comparator.comparingInt(a -> a[1]));

        // Extract the values
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK[i][0];
        }

        return result;
    }
}
