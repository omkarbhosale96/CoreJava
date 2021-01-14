package stringBufferPalindrome;

public class MyString {

	public static void main(String[] args) {
		StringBuffer[] sb=new StringBuffer[10];
		
		sb[0]=new StringBuffer("ab");
		sb[1]=new StringBuffer("abcd");
		sb[2]=new StringBuffer("abcde");
		sb[3]=new StringBuffer("abcba");
		sb[4]=new StringBuffer("aba");
		sb[5]=new StringBuffer("abcdcba");
		sb[6]=new StringBuffer("abcdefg");
		sb[7]=new StringBuffer("abcdedcba");
		sb[8]=new StringBuffer("a");
		sb[9]=new StringBuffer("abcdefedcba");
		int count=0;
		for(int i=0;i<sb.length;i++)
		{
			
			String temp=sb[i].toString();
			StringBuffer rev=sb[i].reverse();
			String temp2=new String(rev);
			
			if(temp.equals(temp2))
			{
				count++;
			}
		}
		System.out.println(count);
		StringBuffer[] sb2=new StringBuffer[count];
		count=0;
		for(int i=0;i<sb.length;i++)
		{
			String temp=sb[i].toString();
			StringBuffer rev=sb[i].reverse();
			String temp2=new String(rev);
			if(temp.equals(temp2))
			{
				sb2[count++]=sb[i];
			}
		}
		for(int i=0;i<sb2.length;i++)
		{
			for(int j=i+1;j<sb2.length;j++)
			{
				if(sb2[i].length()>sb2[j].length())
				{
					StringBuffer temp=sb2[i];
					sb2[i]=sb2[j];
					sb2[j]=temp;
				}
			}
		}
		for(StringBuffer p:sb2)
			System.out.println(p);

		
	}

}
