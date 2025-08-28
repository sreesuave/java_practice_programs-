package thread;
class mythread extends Thread
{
	public void mess() {
		System.out.print("nothing");
	}
	
}
public class Threadexample1 {

	public static void main(String[] args) throws InterruptedException {
		
mythread obj = new mythread();
obj.start();
//obj.wait(6000);
synchronized(obj) {
    obj.wait();  
}
obj.mess();
	}

}
