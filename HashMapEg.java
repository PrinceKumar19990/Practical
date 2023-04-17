package Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class HashMapEg {
	public static void main(String[] args) {
	// creating map
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, " Mango");
		map.put(102, " Orange");
		map.put(108, " Banana");
		map.put(103, null);
		map.put(null , null);
		map.put(null , "Apple");
		// traversing
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}

}
