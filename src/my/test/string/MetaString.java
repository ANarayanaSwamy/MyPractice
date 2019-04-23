package my.test.string;

public class MetaString {
	public static void main(String[] args) {
		System.out.println(metaString("geeks", "keegs"));
		System.out.println(metaString("rsting","string"));
		System.out.println(metaString("Converse","Conserve"));
		System.out.println(metaString("Converse","Consreve"));
	}
	private static String metaString(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return "No";
		}
		Character diffChar1 = null;
		Character diffChar2 = null;
		int diffCount = 0;
		boolean matched = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				diffCount++;
				if (diffChar1 == null) {
					diffChar1 = str1.charAt(i);
					diffChar2 = str2.charAt(i);
				}else if (diffChar1 == str2.charAt(i) && diffChar2 == str1.charAt(i) && !matched) {
					matched = true;
				}
			}
		}

		if(diffCount == 2 && matched) {
			return "Yes";
		} else {
			return "No";
		}
	}
}
