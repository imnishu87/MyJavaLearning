package test;

public class reverse {

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(revString(str));
	}

	public static String revString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		return rev;
	}
}
