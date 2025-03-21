import java.util.* ;
import java.io.*; 
public class Solution {
	public static String stringSort(String s) {
		// Write your code here.
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
}



// This is the main way to do this question


class StringSort {

    //The Merge Function, handling the core compare & copy logic
    void merge(char arr[], int l, int m, int r)
    {
        
        int n1 = m - l + 1;
        int n2 = r - m;

        char L[] = new char[n1];
        char R[] = new char[n2];

//Logic for backing up to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
      //Logic to compare and copy. The core Merge Logic of the Merge sort.
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

      //Logic to copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

      //Logic to copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

  //The main Merge Sort function from where the sorting begins
    void mergeSort(char arr[], int l, int r)
    {
        if (l < r) {
          // Find the middle point
            int m = l + (r - l) / 2;
          
          // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
          
          // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}