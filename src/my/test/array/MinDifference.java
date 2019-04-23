package my.test.array;

import java.util.Arrays;

public class MinDifference {
	public static void main(String[] args) {
		int[] arr = new int[]  {1, 19, -4, 31, 38, 25, 100};
		int minDiff = method1(arr);
		System.out.println(minDiff);
		minDiff = method2(arr);
		System.out.println(minDiff);
	}

	private static int method2(int[] arr) {
		Arrays.sort(arr);
		// Initialize difference as infinite
        int diff = Integer.MAX_VALUE;
       
        // Find the min diff by comparing adjacent
        // pairs in sorted array
        for (int i=0; i<arr.length-1; i++)
           if (arr[i+1] - arr[i] < diff)
               diff = arr[i+1] - arr[i];
        
        return diff;
	}

	private static int method1(int[] arr) {
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int diff = Math.abs(arr[i] - arr[j]);
				if (diff < minDiff) {
					minDiff = diff;
				}
			}
		}
		return minDiff;
	}
}
