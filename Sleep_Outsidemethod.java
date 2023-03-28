package Thread;
// outside the runmethod 
public class Sleep_Outsidemethod extends Thread {
	public void run() {
		for (int i=0; i<=5; i++) { // 012345  012345   012345
			try {
				Thread.sleep(800); // thread will sleep for 800 mili sc
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}}
public static void main (String[] args) {
	Sleep_Outsidemethod t =new Sleep_Outsidemethod();
	Sleep_Outsidemethod t1 = new Sleep_Outsidemethod();
	t.start();
	t1.start();
}}
	
