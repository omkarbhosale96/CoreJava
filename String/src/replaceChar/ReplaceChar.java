package replaceChar;

public class ReplaceChar {

	public static void main(String[] args) {
		String s="Good and bad";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='d')
			{
				a[i]='f';
			}
		}
		for(char p:a)
			System.out.print(p);

	}

}
