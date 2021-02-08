package customerUser;

public final class StringUtils {
	public static boolean areEquivalent(String[] a, String[] b) {
		if (a.length == b.length) {
			for (String s : a) {
				if (find(s, b) < 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static int find(String toFind, String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equals(toFind)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean equals(String a, String b) {
		if (a == null || b == null) {
			return false;
		}
		return a.equals(b);
	}
}
