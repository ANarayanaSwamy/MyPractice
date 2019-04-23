package my.test.array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		int[] res = revUsingMid(arr);
		System.out.println(Arrays.toString(res));
		rev(arr,6);
		System.out.println(Arrays.toString(arr));
		rev(arr,2);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	private static int[] revUsingMid(int[] arr) {
		int[] res = new int[arr.length];
		int mid = arr.length / 2;
		int idx = 0;
		int idx1 = mid;
		for (int i = arr.length-1; i >= mid; i--) {
			res[idx++] = arr[i];
			res[idx1++] = arr[i - mid];
		}
		return res;
	}

	static void rev(int[] arr,int batch) {
		for(int i=0;i<arr.length-1;) {
			rev(arr,i,i+batch-1);
			i+=batch;
		}
	}
	static void rev(int[] arr,int start,int end) {
		while(start <= end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}
}
