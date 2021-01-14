package lengthOfString;

public class LengthOfString {

	public static void main(String[] args) {
		String s="UNIVERSAL";
		
		s=s+"\0";
		int i=0;
		boolean flag=true;
		while(flag)
		{
			if(s.charAt(i)!='\0')
				i++;
			else
				flag=false;
		}
		System.out.println(i);
	}

}
