package Thread;
// creating thread by extending thread class 
class ThreadExaple extends Thread{
	public void run() {
		System.out.println(" i am Thread..... thread is running");
		
	}
	public static void main(String[]args) {
		ThreadExaple t =new ThreadExaple();
	}
}