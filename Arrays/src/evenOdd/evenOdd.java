package evenOdd;

public class evenOdd {

	int[] a= {1,2,3,4,5,6,7,8,9,0};
	int[] even;
	int[] odd;
	int evenCnt=0,oddCnt=0;
	void getCount()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				evenCnt++;
			else
				oddCnt++;
		}
		System.out.println(evenCnt);
		System.out.println(oddCnt);
	}

	void getArray()
	{
		even=new int[evenCnt];
		odd=new int[oddCnt];
		evenCnt=0;
		oddCnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				even[evenCnt++]=a[i];
			else 
				odd[oddCnt++]=a[i];
		}
		for(int p:even)
		System.out.print(p+" ");
		System.out.println();
		for(int p:odd)
			System.out.print(p+" ");
	}
}
