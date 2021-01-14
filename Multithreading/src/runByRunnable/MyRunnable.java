package runByRunnable;

public class MyRunnable {

	public static void main(String[] args) {
		Run1 r1=new Run1();
		Run2 r2=new Run2();
		Run3 r3=new Run3();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
