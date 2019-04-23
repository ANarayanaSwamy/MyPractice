package my.test.geo;

public class SquareChecker {
	static class CoOrdinate {
		public CoOrdinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

		int x;
		int y;

		public int distance(CoOrdinate c2) {
			return (this.x - c2.x) * (this.x - c2.x) + (this.y - c2.y)
					* (this.y - c2.y);
		}
	}

	public static void main(String[] args) {
		CoOrdinate c1 = new CoOrdinate(20, 10);
		CoOrdinate c2 = new CoOrdinate(10, 20);
		CoOrdinate c3 = new CoOrdinate(20, 20);
		CoOrdinate c4 = new CoOrdinate(10, 10);

		System.out.println(isSquare(c1, c2, c3, c4));
	}

	private static boolean isSquare(CoOrdinate c1, CoOrdinate c2,
			CoOrdinate c3, CoOrdinate c4) {
		int d1 = c1.distance(c2);
		int d2 = c1.distance(c3);
		int d3 = c1.distance(c4);
		System.out.println(d1+" "+d2+" "+d3);
		
		return false;
	}

}
