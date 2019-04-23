package my.test.sort;

public class MergeSort implements Sorter {

	@Override
	public void sort(int[] input) {
		int[] sort = mergeSort(input);
		for (int i = 0; i < sort.length; i++) {
			input[i]=sort[i];
		}
	}

	private int[] mergeSort(int[] input) {
		if(input.length <= 1)
		{
			return input;
		}
		int mid = (input.length) / 2;
		int[] sub1 = new int[mid];
		System.arraycopy(input, 0, sub1, 0, mid);
		int[] sub2 = new int[mid];
		System.arraycopy(input, mid + 1, sub2, 0, mid);
		int[] result = new int[input.length];
		merge(result, mergeSort(sub1), mergeSort(sub2));
		return result;
	}

	private void merge(int[] result, int[] sub1, int[] sub2) {
		int idx = 0;
		int sub1Idx = 0;
		int sub2Idx = 0;
		int common = Math.min(sub1.length, sub2.length);
		for (int i = 0; i < common; i++) {
			if (sub1[sub1Idx] > sub2[sub2Idx]) {
				result[idx++] = sub2[sub2Idx++];
			} else {
				result[idx++] = sub1[sub1Idx++];
			}
		}
		System.arraycopy(sub1, sub1Idx, result, result.length, sub1.length
				- sub1Idx);
		System.arraycopy(sub2, sub2Idx, result, result.length, sub2.length
				- sub2Idx);
	}

}
