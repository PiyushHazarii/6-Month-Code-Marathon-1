import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
class Solution {
    public static boolean searchGrid(ArrayList<ArrayList<Integer>> mat, int n, int m, int target) {
        // Write your code here
        // Return true or false
        int row = 0, col = m - 1;

        // just simple searching 
        while (row < n && col >= 0) {
            if (mat.get(row).get(col) == target) {
                return true;
            } else if (mat.get(row).get(col) > target) {
                col--;  // Move left
            } else {
                row++;  // Move down
            }
        }
        return false;
    }
}