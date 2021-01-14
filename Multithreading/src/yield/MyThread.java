package yield;

public class MyThread {

	public static void main(String[] args) {
		MainTh m=new MainTh();
		SubTh s=new SubTh();
		m.start();
		s.start();

	}

}
