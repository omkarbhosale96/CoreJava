package indexOfAlphabets;

public class IndexOfAlphabets {

	public static void main(String[] args) {
		
		String a="Omkar@1234";
		
		
		
		for(int i=0;i<a.length();i++)
		{
			if((a.charAt(i)>='A' && a.charAt(i)<='Z') || (a.charAt(i)>='a' && a.charAt(i)<='z' ))
			{
				System.out.println("Index of "+a.charAt(i)+" is "+i);
			}
		}

	}

}
