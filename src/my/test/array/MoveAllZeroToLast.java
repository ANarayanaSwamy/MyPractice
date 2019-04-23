package my.test.array;

import java.util.Arrays;

public class MoveAllZeroToLast {
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 0, 4, 3, 0, 5, 0 };
		int resIdx = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				input[resIdx++] = input[i];
			}
		}
		for(int i=resIdx;i<input.length;i++){
			input[i]=0;
		}
		System.out.println(Arrays.toString(input));
	}
}
