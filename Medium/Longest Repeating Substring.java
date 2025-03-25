public class Solution {
    public static int longestRepeatingSubstring(String str, int k) {
        int[] freq = new int[26]; // Frequency of characters in the current window
        int left = 0, maxCount = 0, maxLength = 0;

        for (int right = 0; right < str.length(); right++) {
            char rightChar = str.charAt(right);
            freq[rightChar - 'A']++; // Increase frequency of current char
            maxCount = Math.max(maxCount, freq[rightChar - 'A']); // Track max frequency char in the window

            // If remaining chars exceed k, shrink window from left
            if ((right - left + 1) - maxCount > k) {
                freq[str.charAt(left) - 'A']--; // Remove left char from window
                left++; // Move left pointer
            }

            // Update max window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
