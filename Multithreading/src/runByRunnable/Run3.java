package runByRunnable;

public class Run3 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Run3");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
