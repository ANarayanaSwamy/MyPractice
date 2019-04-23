package my.test.sort;

public class BubbleSort implements Sorter {

	private static void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

	@Override
	public void sort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i] < input[j]) {
					swap(input, i, j);
				}
			}
		}

	}
}
