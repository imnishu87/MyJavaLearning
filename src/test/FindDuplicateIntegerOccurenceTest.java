package test;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicateIntegerOccurenceTest {

	public static void main(String args[]) {
		int[] allNums = new int[] { 1, 1, 2, 2, 3 };
		System.out.println(getDup(allNums));
	}

	private static ArrayList<Integer> getDup(int[] allNums) {
		ArrayList<Integer> dupNum = new ArrayList<>();
		HashMap<Integer, Integer> numbers = new HashMap<>();
		for (Integer num : allNums) {
			if (numbers.containsKey(num)) {
				if (!dupNum.contains(num))
					dupNum.add(num);
			} else {
				numbers.put(num, 1);
			}

		}
		return dupNum;
	}
}
