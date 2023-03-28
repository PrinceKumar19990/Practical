package Thread;
// inside method
public class Sleep_InsideMethod extends Thread {
	public static void main (String[] args) {
		try {
			for (int i=0; i<=5; i++) { // 012345  012345   012345
			
					Thread.sleep(800); // thread will sleep for 800 mili sc
					System.out.println(i);
				}}
				catch(InterruptedException ie) {
					System.out.println(ie);		
	}}}
		