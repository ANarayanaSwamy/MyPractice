package my.test.array;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int arr[] = { 8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1 };
		rotate(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotate(int[] arr) {
		int d = 3;
		for(int i=0;i<d;i++){
			int tmp = arr[0];
			for(int j=1;j<arr.length;j++){
				arr[j-1] = arr[j];
			}
			arr[arr.length-1] = tmp;
		}
	}
}
