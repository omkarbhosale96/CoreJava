package sortString;

public class MyString {

	public static void main(String[] args) {
		String s="54321";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
		}
		
		
		for(char p:c)
			System.out.print(p);
	}

}
