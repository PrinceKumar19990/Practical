package Thread;

class ThreadExample5 extends Thread {
	  public void run(){  
		   System.out.println("write code");  
		 }  }
		 
		 class ThreadExample6 extends Thread{
			 public void run() {
				 System.out.println("check code");
			 }
		 }
		 
		 public class ThreadExample4{
		 public static void main(String args[]){  
			 ThreadExample5 t1=new ThreadExample5();  
			 ThreadExample6 t2= new ThreadExample6();
		  t1.start();  
		  t2.start();  
		 
		 } }