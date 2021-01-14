package evenOdd2;

public class EvenOddByWhile {

	public static void main(String[] args) {
		int[] a= {0,1,2,3,4,5,6,7,8,9};
		
		int i=0;
		int j=a.length-1;
		
		while(i<j)
		{
			if(a[i]%2!=0 && a[j]%2==0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			else if(a[i]%2==0)
				i++;
			else 
				j--;
		}
		for(int p:a)
			System.out.print(p+" ");

	}

}
