package Thread;

public class CurrentThreadName extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
		
public static void main(String[] args) {
	CurrentThreadName obj =new CurrentThreadName();
	CurrentThreadName obj1 =new CurrentThreadName();
	obj.start();
	obj1.start();
}
}