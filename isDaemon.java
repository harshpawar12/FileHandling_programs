package FileHanling;

class Daemon extends Thread
{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("isDaemon");
		}
		else
		{
			System.out.println("Not Daemon");
		}
	}
}
public class isDaemon {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Daemon D=new Daemon();

		D.setDaemon(true);
		D.start();
	//	D.join();
		System.out.println("main Method exected...!!");


	}

}
