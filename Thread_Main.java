package Thread;

class EvenThread extends Thread {
    public void run() {
    	System.out.println("Even");
        for (int i = 2; i <= 100; i += 2) {
            try {
                Thread.sleep(60);
                
                System.out.print(i+" ");
                
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
      System.out.println();  
    }
   
}

class OddThread extends Thread {
    public void run() {
    	System.out.println("odd");
        for (int j = 1; j <= 100; j += 2) {
            try {
                // wait for the even thread to complete
                Thread.sleep(60);
                // print odd numbers
              
                System.out.print(j+" ");
               
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Thread_Main {
    public static void main(String[] args) {
        EvenThread t= new EvenThread();
        OddThread t1 = new OddThread();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t1.start();
    }
}