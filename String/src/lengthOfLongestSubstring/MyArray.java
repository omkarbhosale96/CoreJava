package lengthOfLongestSubstring;

public class MyArray {

	public static void main(String[] args) {
		
		String s="abcd aaabccd abcdef";
		
		String a[]=s.split(" ");
		
		int maxl=0;
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int length=0;
			int count=0;
			char c[]=a[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
				for(int k=j+1;k<c.length;k++)
				{
					if(c[j]==c[k])
					{
						count++;
						break;
					}
				}
			}
			
			length=c.length-count;
			
			if(maxl<length)
			{
				maxl=length;
				index=i;
			}
		}
		System.out.println(maxl+" "+index);

	}

}
