package findFrequeny;

public class MyString {

	public static void main(String[] args) {
		String s="aaabbacccd";
		
		int a[]=new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++)
		{
			if(a[s.charAt(i)]!=0)
			{
				System.out.println(s.charAt(i)+" "+a[s.charAt(i)]);
				a[s.charAt(i)]=0;
			}
		}

	}

}
