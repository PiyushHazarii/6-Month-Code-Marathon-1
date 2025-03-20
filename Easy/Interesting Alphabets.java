import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Character>> interestingPattern(int N) {

		ArrayList<ArrayList<Character>> result = new ArrayList<>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < N; i++) {
            ArrayList<Character> row = new ArrayList<>();
            // Extract substring from (N - i - 1) to N
            String subStr = alphabet.substring(N - i - 1, N);
            
            // Add each character of the substring to the row list
            for (char ch : subStr.toCharArray()) {
                row.add(ch);
            }
            
            result.add(row);
        }
        
        return result;


        // This is second approach


        // for (int i = 0; i < N; i++) {
        //     ArrayList<Character> row = new ArrayList<>();
        //     char startChar = (char) ('A' + (N - i - 1)); // Determine starting character
            
        //     for (char ch = startChar; ch <= 'A' + (N - 1); ch++) {
        //         row.add(ch); // Add characters to the row
        //     }
            
        //     result.add(row); // Add row to the final result
        // }
        
        // return result;
	}
}