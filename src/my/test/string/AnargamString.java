package my.test.string;

import java.util.Arrays;

public class AnargamString {
	public static void main(String[] args) {
		String s1 = "AAABABAA";
		String s2 = "AABA";
		for (int i = 0; i < s1.length(); i++) {
			if (i + s2.length() - 1 < s1.length()) {
				String tmp = s1.substring(i, i + s2.length());
				boolean isAnagram = isAnagram(tmp, s2);
				if (isAnagram) {
					System.out.println(i + " ," + tmp);
				}
			}
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
}
