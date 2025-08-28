package thread;
class mythreads extends Thread{
	public void runs()
	{
		System.out.println("the thread is running");
	}
}
public class Main {
	public static void main (String [] args) throws InterruptedException
	{
		mythreads obj = new mythreads();
		System.out.println(Thread.currentThread().getName());
		obj.sleep(3000);
		obj.join();
		System.out.println("the thread is waiting for 1st one to completed");
		obj.start();
		obj.runs();
	}
	

}
