package my.test.array;

public class FindMaxInIncreasingArray {
	public static void main(String[] args) {
		int arr[] = { 8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < max) {
				break;
			}
			max = arr[i];
		}
		System.out.println(max);
	}
}
