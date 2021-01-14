package problemStatement;

public class MyString {

	public static void main(String[] args) {
		String s="Welcome to Java World";
		char c=s.charAt(5);
		System.out.println(c);
		
		System.out.println(s.compareToIgnoreCase("Welcome"));
		
		String s1=s.concat("-Let us learn");
		System.out.println(s1);
		
		int index=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				index=i;
				break;
			}
		}
		System.out.println(index);
		char b[]=s.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]=='a')
			{
				b[i]='e';
			}
		}
		for(char p:b)
			System.out.print(p);
		System.out.println();
		String s3=s.substring(4, 10);
		System.out.println(s3);
	}

}
