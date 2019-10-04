package test;

import java.util.ArrayList;

public class Duplicatechar {

	
	public static void main(String args[])
	{
		ArrayList<String> stringList=new ArrayList<>();
		stringList.add("nishu");
		stringList.add("test");
		stringList.add("nishu");
		System.out.println(removeDuplicates(stringList));
	}
	
	
	
	private static ArrayList<String> removeDuplicates(ArrayList<String> stringList) {

        ArrayList<String> noDupsList = new ArrayList<>();

        for(String string: stringList){
            if (!noDupsList.contains(string)){
                noDupsList.add(string);
            }
        }
        return noDupsList;
    }
}

