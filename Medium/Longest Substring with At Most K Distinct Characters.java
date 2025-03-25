import java.util.*;

public class Solution {
    public static int kDistinctChars(int k, String str) {
        if (k == 0) return 0;
        
        int left = 0, maxLength = 0;
        Map<Character, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < str.length(); right++) {
            char rightChar = str.charAt(right);
            freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);

            // Shrink window if distinct character count exceeds K
            while (freqMap.size() > k) {
                char leftChar = str.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) {
                    freqMap.remove(leftChar);
                }
                left++; // Move left pointer
            }

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
