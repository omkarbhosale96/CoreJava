package lowestFrequentChar;

public class MyString {

	public static void main(String[] args) {
		String s="aaabbacccd";
		
		int a[]=new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]++;
		}
		int min=Integer.MAX_VALUE;
		char minChar=' ';
		
		for(int i=0;i<s.length();i++)
		{
			if(a[s.charAt(i)]<min)
			{
				min=a[s.charAt(i)];
				minChar=s.charAt(i);
			}
		}
		System.out.println(minChar);

	}

}
