package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListMethod {
	public static void main(String[] args) {
	List<String> al = new ArrayList<String>(); 
	al.add("Ram");
	al.add("sam");
	al.add("rose");
	al.add("liza");
	al.add("Upasna");
	al.add("Rahul");
	Collections.sort(al);
	System.out.println("traversing using for loop");
	for(String name:al) {
		System.out.println(name);}
	String element = al.get(2); // get() method
	System.out.println(" Get index :"+ element);
	System.out.println(" Array list is :" + al.isEmpty());// isEmpty()
	String element1 = al.remove(4);// remove()
	System.out.println(" Remove index:"+ element1);
	System.out.println(" traversing using for loop");
	for (int i =0; i<al.size(); i++) {
		System.out.println(al.get(i));
	}
	}

}
