package cipher;

public class MyString {

	public static void main(String[] args) {
		String s="abcXYZ";
		
		s=s.toUpperCase();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			c[i]= (char) (155-c[i]);
		}
		for(char p:c)
			System.out.print(p);
	}

}
