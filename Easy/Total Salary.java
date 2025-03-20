import java.util.* ;
import java.io.*; 

public class Solution {
	public static int totalSalary(int basic, char grade) {
		// Calculate the components
        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double pf = 0.11 * basic;

        // Determine the allowance based on the grade
        int allowance;
        if (grade == 'A') {
            allowance = 1700;
        } else if (grade == 'B') {
            allowance = 1500;
        } else {
            allowance = 1300;
        }

        // Calculate the total salary
        double totalSalary = basic + hra + da + allowance - pf;

        // Return the rounded salary as an integer
        return (int) Math.round(totalSalary);
	}
}
