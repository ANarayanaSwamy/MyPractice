package my.test.sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] input = { 2, 3, 57, 8, 9, 2, 2, 6, 1 };
		print(input);
		quickSort(input,0,input.length-1);
		print(input);
	}

	private static void print(int[] input) {
		System.out.println(Arrays.toString(input));
	}

	private static void quickSort(int[] input,int left,int right) {
		if(left >= right){
			return;
		}
		int index = partition(input,left,right);
		quickSort(input, left, index-1);
		quickSort(input, index+1, right);
	}

	private static int partition(int[] input, int left, int right) {
		int pivot = input[right];
		int i = left-1;
		for(int j=left;j<right;j++){
			if(input[j] <= pivot){
				i++;
				int tmp = input[i];
				input[i] = input[j];
				input[j] = tmp;
			}
		}
		
		 int temp = input[i+1];
		 input[i+1] = input[right];
		 input[right] = temp;
		 return i+1;
	}
	
	private static void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
