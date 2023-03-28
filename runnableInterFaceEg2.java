package Thread;
// Thread ( Runnable obj, String name )
public class runnableInterFaceEg2 implements Runnable{
	public void run () {
		System.out.println( " thread is running");
	}
public static void main (String[] args) {
	// creating object of runnableInterFaceEg2
			Runnable ri =new runnableInterFaceEg2 ();
//Creating 
			Thread t=new Thread (ri ," Prince");
			
			t.start();
			String s= t.getName();
			System.out.println(s);
		

		}

	}

	

