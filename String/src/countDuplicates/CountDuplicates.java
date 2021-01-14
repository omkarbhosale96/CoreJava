package countDuplicates;

public class CountDuplicates {

	public static void main(String[] args) {

		String s="aaabbbaccd";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		System.out.println("No of duplicate elements:"+count);
		
		int a[]=new int[256];
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]++;
		}
		
		for(int i=0;i<s.length();i++)
		{
			
			if(a[s.charAt(i)]>1)
			{
				System.out.println(s.charAt(i)+" "+a[s.charAt(i)]);
				a[s.charAt(i)]=0;
			}
			
		}
		
		
	}

}
