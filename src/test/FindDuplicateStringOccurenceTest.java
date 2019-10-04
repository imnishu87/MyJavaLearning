package test;

import java.util.HashMap;

public class FindDuplicateStringOccurenceTest {

	public static void main(String args[]) {
		String testString = "Home Sweet home.";
		String[] splitStringArray = testString.toLowerCase()
				.replace(".", "")
				.replace(",", "")
				.split(" ");
		System.out.println(getDup(splitStringArray));
	}

	private static HashMap<String, Integer> getDup(String[] splitStringArray) {

		HashMap<String, Integer> stringOccurenceMap = new HashMap<>();

		for (String str : splitStringArray) {
			if (stringOccurenceMap.containsKey(str)) {
				int strOldOccurenceValue = stringOccurenceMap.get(str);
				stringOccurenceMap.remove(str);
				stringOccurenceMap.put(str, strOldOccurenceValue + 1);
			} else {
				stringOccurenceMap.put(str, 1);
			}

		}
		return stringOccurenceMap;
	}
}
