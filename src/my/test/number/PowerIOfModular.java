package my.test.number;

public class PowerIOfModular {
	public static void main(String[] args) {
		System.out.println(powOfMod(2312, 3434, 6789));
	}

	/**
	 *  Compute (a^b)%c 
	 *  if b is odd
	 *  (a^b)%c = (a%c)*(a^(b-1))%c
	 *  if b is even
	 *  (a^b)%c = ((a%(b/2))*(a^(b/2)))%c
	 */
	private static long powOfMod(int a, int b, int c) {
		if(a == 0) {
			return 0l;
		}
		if(b ==0 ) {
			return 1l;
		}
		long y = 0;
		if( b %2 == 0 ) {
			y = powOfMod(a,b/2,c);
			y  = ( y * y )%c;
		}
		else {
			y = powOfMod(a,b-1,c)%c;
			y = (a%c)*y;
		}
		return y;
	}
}
