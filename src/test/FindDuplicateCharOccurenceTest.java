package test;

import java.util.HashMap;

public class FindDuplicateCharOccurenceTest {

	public static void main(String args[]) {
		String testString = "Struggle";
		char[] splitCharArray = testString.toLowerCase().toCharArray();
		System.out.println(getDup(splitCharArray));
	}

	private static HashMap<Character, Integer> getDup(char[] charArray) {

		HashMap<Character, Integer> charOccurenceMap = new HashMap<>();

		for (char myChar : charArray) {
			if (charOccurenceMap.containsKey(myChar)) {
				int charOldOccurenceValue = charOccurenceMap.get(myChar);
				charOccurenceMap.remove(myChar);
				charOccurenceMap.put(myChar, charOldOccurenceValue + 1);
			} else {
				charOccurenceMap.put(myChar, 1);
			}

		}
		return charOccurenceMap;
	}
}
 