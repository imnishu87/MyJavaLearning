package test;

import java.util.HashMap;
import java.util.Map;

public class ConvertTwoDimensionalArrayToMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] stringArray = new String[][] {{"u1", "p1"}, {"u2", "p2"}, {"u3", "p3"}};
		
		HashMap<String, String> createdMap = getMap(stringArray);
		System.out.println(createdMap);
		
		for (Map.Entry<String, String> entry : createdMap.entrySet()) {			
			System.out.println(entry.getKey() + " " + entry.getValue());	
		}
	}

	private static HashMap<String, String> getMap(String[][] stringArray) {
		HashMap<String, String> userNamePasswordMap = new HashMap<>();
		// TODO Auto-generated method stub
		
		for (int index=0; index < stringArray.length; index++) {
			String userNameAtThisIndex = stringArray[index][0];
			String passwordAtThisIndex = stringArray[index][1];
					
			userNamePasswordMap.put(userNameAtThisIndex, passwordAtThisIndex);
		}
		return userNamePasswordMap;
	}

}
