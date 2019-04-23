package my.test.number;

public class FindMissingNumber {
	public static void main(String[] args) {
	int[] input = new int[]{1, 2, 5, 4, 3, 7, 9,8};
	int missing = getMissing(input);
	System.out.println(missing);
}

	private static int getMissing(int[] input) {
		int n = input.length+1;
		int sum = n*(n+1)/2;
		for (int i = 0; i < input.length; i++) {
			sum = sum-input[i];
		}
		return sum;
	}
}
