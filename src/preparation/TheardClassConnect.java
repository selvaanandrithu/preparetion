package preparation;

public class TheardClassConnect {
	//public static void main(String[] args)
	
	
		//extends Thread model
//		ThreadClass s = new ThreadClass();
//     	s.start();
//     	
     	//implements Runnable model
		
		
		public static void main(String[] args) throws InterruptedException{
     	ThreadClass s = new ThreadClass();
		Thread t = new Thread(s);
		t.start();
		Thread.sleep(2000);
		System.out.println("hi");
		
		
		
	}

}
