package largestAndSmallestWord;

public class MyString {

	public static void main(String[] args) {
		String s="I am Groot";
		s=s.trim();
		String[] s1=s.split(" ");
		int larg=0;
		String ls="";
		int small=s.length();
		String ss="";	
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].length()>larg)
			{
				larg=s1[i].length();
				ls=s1[i];
			}
			if(s1[i].length()<small)
			{
				small=s1[i].length();
				ss=s1[i];
			}
		}
		System.out.println("Largest word is:"+ls);
		System.out.println("Smallest word is:"+ss);

	}

}
