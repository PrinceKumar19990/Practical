package Thread;

 class Sthared_eg5{   /// class 1
	synchronized void print(int num ) {//with Synchronized method
		for(int i=1;i<=5;i++) {
			System.out.println(num+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}}}}
	public class Synchronized_Eg2{// main class
	public static void main(String[] args) {
		final Sthared_eg5 obj =new Sthared_eg5(); // created obj of Sthred_Test class
	
	//1st thread object t1
	Thread t1 =new Thread(){
   public void run() {
	   obj.print(2);
   }
		};
			//2st thread object t1
			Thread t2 =new Thread(){
		   public void run() {
			   obj.print(5);
		   }
	};
	t1.start();
	t2.start();
	}

	}


