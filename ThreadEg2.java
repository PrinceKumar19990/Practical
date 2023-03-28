package Thread;

public class ThreadEg2 {
	// directly we use thread class without extend
	// with & without set name we can name the thread	
		public void run() {
			System.out.println(" pinki");
		}
		public static void main(String[] args) {
			// creating an object of the thread class using the thread constructor
//			ThreadExample obj = new ThreadExample();
			Thread t= new Thread("pallabi");
			Thread t1= new Thread();
			
					
//			obj.run();
			t.start();// move the thread to the active state
			t1.setName("Anudip");
			System.out.println("thread 0:"+t.getName());
			System.out.println("thread 1:"+t1.getName());
	}}