package my.test.array;

import java.util.HashMap;
import java.util.Map;

public class FindPairsInArrayForSum {
	public static void main(String[] args) {
		int[] input = { 10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1 };
		int sum = 11;
		int count = getPairCount1(input, sum);
		System.out.println(count);
		count = getPairCount2(input, sum);
		System.out.println(count);
		count = getPairCount3(input, sum);
		System.out.println(count);
	}

	private static int getPairCount3(int[] in, int sum) {
		Map<Integer, Integer> set = new HashMap<Integer, Integer>();
		int pairCount = 0;
		for (int i = 0; i < in.length; i++) {
			int curr = in[i];
			Integer count = set.get(curr);
			if (null == count) {
				count = 0;
			}
			set.put(curr, ++count);
			if (curr == sum) {
				pairCount++;
			} else {
				Integer integer = set.get(sum - curr);
				if (null != integer) {
					pairCount = pairCount + integer;
				}
			}
		}
		return pairCount;
	}

	private static int getPairCount1(int[] input, int sum) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			Integer value = map.get(input[i]);
			if (null == value) {
				value = Integer.valueOf(0);
			}
			map.put(input[i], ++value);
		}
		System.out.println(map);
		for (int i = 0; i < input.length; i++) {
			Integer pending = sum - input[i];
			if (map.containsKey(pending)) {
				count += map.get(pending);
			}
			if (pending == input[i]) {
				count--;
			}
		}
		return count / 2;
	}

	private static int getPairCount2(int[] input, int sum) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == sum) {
					count++;
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		return count;
	}
}
