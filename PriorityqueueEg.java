package Collection;
import java.util.PriorityQueue;
import javax.swing.text.html.HTMLDocument.Iterator;

public class PriorityqueueEg {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add(" Prakash");
        queue.add("Babai");
        queue.add("Sankhajit");
        queue.add("Hasan");
        queue.add("Bumba");
        queue.add("Owashim");
        queue.add("Tanmoy");
        System.out.println("head:" + queue.element());
        System.out.println("Quequ:" + queue);
        System.out.println("head:" + queue.peek());
        System.out.println("Queue:" + queue);
        System.out.println("iterating the elements");
        Iterator itr = (Iterator) queue.iterator();
        
	}

}
