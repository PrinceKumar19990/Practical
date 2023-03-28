package Thread;

public class JoinMethod extends Thread {
	public void run() {
		for (int i=1; i<=3; i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) { System.out.println(e);
			}System.out.println(i);
		}
	}

	public static void main(String[] args) {
		JoinMethod t =new JoinMethod();
		JoinMethod t1 =new JoinMethod();
		JoinMethod t2 =new JoinMethod();
		t.start();
		//t1.start();
		try {
			t.join();
		}catch (Exception e) {
		
			System.out.println(e);
		}
		t1.start();
			t2.start();
		}
	}


