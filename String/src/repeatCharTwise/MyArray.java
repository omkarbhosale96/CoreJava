package repeatCharTwise;

public class MyArray {

	public static void main(String[] args) {
		String s="ABCD";
		
		char[] a=new char[2*s.length()];
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			a[count++]=s.charAt(i);
			a[count++]=s.charAt(i);
		}
		for(char p:a)
			System.out.print(p);

	}

}
