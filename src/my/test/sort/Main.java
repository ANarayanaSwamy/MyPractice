package my.test.sort;

public class Main {
	public static void main(String[] args) {
		int[] input = new int[] {38, 27, 43, 3, 9, 82, 10};
		//Sorter sort = new BubbleSort();
		Sorter sort = new MergeSort();
		sort.sort(input);
		print(input);
	}
	
	private static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
