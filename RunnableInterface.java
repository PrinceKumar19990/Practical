package Thread;
/* if you are not extending the thread class the object is also not there as a thread
 * object.we need to create to thread class object explicitly we are passing
 * object of our class which implement runnable so that class run() method execute but not start*/
 
public class RunnableInterface implements Runnable {
public void run () {
	System.out.println( " I am Thread...... thread is running");
}

	public static void main(String[] args) {
		RunnableInterface ri =new RunnableInterface ();
		Thread t=new Thread(ri);
		t.start();
	

	}

}
