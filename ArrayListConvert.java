package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListConvert {
		public static void main(String[] args) {
// ArrayList all = new ArrayList(); // non-generic
		ArrayList<String> al = new ArrayList<String>();//creating a arraylist
		//add element in arraylist through object
		al.add("Ritu");
		al.add("Hemant");
		al.add("Ritu");
		al.add("Deepak");
		al.add("Upasna");
		al.add("Rahul");
// conveting of listt to array
System.out.println(" List to Array");
String [] arr = al.toArray(new String[al.size()]); //to Array() method used
for (String s : arr) { // traversing using for each
	System.out.println(s);
}
// array to List
System.out.println("Array to List");
List<String> all = new ArrayList<String>();
all=Arrays.asList(arr);// asList method convert array to list
System.out.println(all);
}
}