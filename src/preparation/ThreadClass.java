package preparation;

//public class ThreadClass extends Thread{
	
	public class ThreadClass implements Runnable {
	
	@Override
	public void run() {
//		System.out.println("Hellow");
		synchronized (ThreadClass.class){
		System.out.println("Thread is running");
		
		try {
			ThreadClass.class.wait(5000);
			System.out.println("hai");
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}
	}
	

	
}
