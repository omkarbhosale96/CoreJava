package removeDuplicate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s="aabcbacccd";
		
		int[] a=new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]=a[s.charAt(i)]+1;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print((char)i);
			}
		}
		
//		Set<Character> st=new HashSet<>();
//		
//		for(int i=0;i<s.length();i++)
//		{
//			st.add(s.charAt(i));
//		}
//		Iterator<Character> it=st.iterator();
//		while(it.hasNext())
//		{
//			System.out.print(it.next());
//		}
			
}

}
