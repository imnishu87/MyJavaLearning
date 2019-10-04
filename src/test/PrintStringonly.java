package test;

public class PrintStringonly {
	
	public static void main(String args[])
	{
		String str="a:b:c:d";
		System.out.println(str.length());
		System.out.println(str.replace(":", ""));
		
		StringBuilder sb = new StringBuilder();
		String[] splitString = str.split(":");
		
		for(String c : splitString) {
			System.out.println(c);
			sb.append(c+"1");
		}
		
		System.out.println(sb);

	}
//	
//	private static String(String str)
//	{
//		
//	}
}
