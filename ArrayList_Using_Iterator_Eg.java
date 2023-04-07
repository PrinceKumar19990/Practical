package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Using_Iterator_Eg {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<String>();
	al.add("Rose");
	al.add("Sunflower");
	al.add("Lily");
	al.add("Daisy");
	al.add("Marigold");
	al.add("Tulip");
	al.add("Jasmine");
	al.add("Orchid");
	al.add("lotus");
	al.add("Lavender");
	
	System.out.println("Traversing using for loop");
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}	
	System.out.println("Traversing using for each loop");
	for(String a:al) {
		System.out.println(a);
	}
	System.out.println("Traversing using for iterator");//forward
	Iterator itr =al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("Traversing using for iterator-forward");
	ListIterator<String> itr1= al.listIterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	System.out.println("Traversing using iterator-backward");
	ListIterator<String> itr2=al.listIterator(al.size());
	while(itr2.hasPrevious()) {
		System.out.println(itr2.previous());
	}
	System.out.println("Traversing using forEach() method");
	al.forEach(a-> System.out.println(a));	
}
}