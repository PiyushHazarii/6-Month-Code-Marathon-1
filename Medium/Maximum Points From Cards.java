public class Solution {
    public static int maxPoints(int[] arr, int K) {
        int n = arr.length;
        int leftSum = 0;
        
        // Compute sum of first K elements from the left
        for (int i = 0; i < K; i++) {
            leftSum += arr[i];
        }

        int maxScore = leftSum;
        int rightSum = 0;
        
        // Start sliding window: remove from left, add from right
        for (int i = 0; i < K; i++) {
            leftSum -= arr[K - 1 - i];  // Remove element from left side
            rightSum += arr[n - 1 - i]; // Add element from right side
            maxScore = Math.max(maxScore, leftSum + rightSum);
        }

        return maxScore;
    }
}
