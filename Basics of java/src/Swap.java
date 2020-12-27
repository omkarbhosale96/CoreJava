
public class Swap {
	
	int a;
	int b;
	void swapNum(int a,int b) {
		
		this.a=a;
		this.b=b;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	

}
