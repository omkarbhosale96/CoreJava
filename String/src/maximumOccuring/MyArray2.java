package maximumOccuring;

public class MyArray2 {

	public static void main(String[] args) {
		String s="aabbbaaacccc";
		
		int[] a=new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]++;
		}
		int maxIndex=0;
		int maxIndex2=0;
		char max=' ';
		char max2=' ';
		for(int i=0;i<s.length();i++)
		{
			if(maxIndex<a[s.charAt(i)])
			{
				maxIndex2=maxIndex;
				max2=max;
				maxIndex=a[s.charAt(i)];
				max=s.charAt(i);
			}
			else if(maxIndex2<a[s.charAt(i)] && maxIndex!=a[s.charAt(i)])
			{
				maxIndex2=a[s.charAt(i)];
				max2=s.charAt(i);
			}
											
		}
		System.out.println(max+" "+maxIndex);
		System.out.println("Second largest occuring");
		System.out.println(max2+" "+maxIndex2);

	}

}
