package my.test.number;

public class SetBits {
	public static void main(String[] args) {
		int n = 6;
		System.out.println(getSetBits(n));
	}

	private static int getSetBits(int num) {
		int count = 0;
		for (int i = 0; i <= num; i++) {
			int n = i;
			while (n != 0) {
				if (n % 2 == 1) {
					count++;
				}
				n = n / 2;
			}
			System.out.println(i+" .. "+count);
		}
		return count;
	}
}
