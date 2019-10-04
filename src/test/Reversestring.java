package test;

public class Reversestring {
	
	public static void main(String args[])
	{
		String rev="mom";
		System.out.println(revString(rev));
		System.out.println(isPalindrome(rev));

	}
	
	private static String revString(String str)
	{
		char ch[]=str.toCharArray();
		String rev="";
		for (int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		return rev;
	}
	
	private static Boolean isPalindrome(String str)
	{
		char ch[]=str.toCharArray();
		Boolean toReturn=true;
		
		for (int i=0;i<=ch.length-1;i++)
		{
			if(ch[i] != ch[ch.length-(i+1)])
			{
				toReturn=false;
				break;
			}
			
		}
		return toReturn;
		}
	


}
