package HasSet;
//Import the HashSet class

import java.util.HashSet;
    
public class HasSetExample {
	public static void main(String[] args) {
	HashSet<String> HS = new HashSet<String>();
	HS .add("BMW");
	HS .add("VOLO");
	HS .add("FARARI");
	HS .add("ODDI");
	HS .add("BMW");
	 System.out.println(HS);
	 
	// Remove an Item 
	HS.remove("BMW");
		System.out.println(HS);
	
	// Check If an Item Exists
	System.out.println(HS.contains ("VOLO"));
	
	// Loop Through a HashSet
	for(String i : HS) {
		System.out.println(i);
	}
	
	}

}
