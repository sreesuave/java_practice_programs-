package thread;

public class Thread_States {
 static class TicketBooking implements Runnable {
	        @Override
	        public void run() {
	            try {
	                
	                System.out.println("Thread state during sleep: " + Thread.currentThread().getState());
	                Thread.sleep(200);
	                System.out.println("Thread state after sleep: " + Thread.currentThread().getState());
                   synchronized (this) {
	                    wait(); }
	                System.out.println("Thread state after wait: " + Thread.currentThread().getState());
	            } catch (InterruptedException e) {
	                e.printStackTrace();}
	        }
	    }
 public static void main(String[] args) throws InterruptedException {
	        // NEW: Thread is created but not started
	        Thread bookingThread = new Thread(new TicketBooking());
	        System.out.println("Thread state after creation: " + bookingThread.getState());

	        // RUNNABLE: Thread is started
	        bookingThread.start();
	        System.out.println("Thread state after start: " + bookingThread.getState());
// Allow some time for the thread to transition to TIMED_WAITING
	        Thread.sleep(100);
// BLOCKED: Main thread enters synchronized block, causing bookingThread to block
	        synchronized (bookingThread) {
	            System.out.println("Thread state during synchronized block: " + bookingThread.getState());
	            // Notify the bookingThread to proceed
	            bookingThread.notify();
	        }// Allow some time for the thread to transition to TERMINATED
	        Thread.sleep(100);
	        // TERMINATED: Thread has finished execution
	        System.out.println("Thread state after completion: " + bookingThread.getState());
	    }
	}
