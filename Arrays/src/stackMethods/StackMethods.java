package stackMethods;

public class StackMethods {
	 int[] a= {10,20,30,40,50,60};
	 int top=a.length-1;
	public void push(int i) {
		if(a[top]!=0)
			top++;
		
		if(top<=a.length-1)
		{
			a[top]=i;
			top++;
		}
		
	}

	public void display() {
		for(int p:a)
		{
			System.out.print(p+" ");
		}
		
	}
	public int pop() {
		int c=0;
		if(top>=0)
		{
			 c=a[top];
			a[top]=0;
			top--;
			
		}
		return c;
		
	}
}
