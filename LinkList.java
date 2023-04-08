package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();// creating array list
		//add element in arraylist through object
			ll.add("Ritu");
			ll.add("hemant");
			ll.add("Ritu");
			ll.add("Deepak");
			ll.add("upashana");
			ll.add("rahul");
			System.out.println("LinkedList+"+ll);
			
		//	Adds an item to the beginning of the list.	
			 // Use addFirst() to add the item to the beginning
		    ll.addFirst("Mazda");
		    System.out.println(ll);
		    
		 // Use addLast() to add the item to the end
		    ll.addLast("Akash");
		    System.out.println(ll);
		    
		 // Use removeFirst() remove the first item from the list
		    ll.removeFirst();
		    System.out.println(ll);
		    
		    // Use removeLast() remove the last item from the list
		    ll.removeLast();
		    System.out.println(ll);
		    
		    // Use getFirst() to display the first item in the list
		    System.out.println(ll.getFirst());
		    
		 // Use getLast() to display the last item in the list
		    System.out.println(ll.getLast());
	}

}
