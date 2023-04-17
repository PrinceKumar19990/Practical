package Collection;
	import java.util.LinkedHashMap;
import java.util.Map;
	public class TreeMapEg {
		public static void main(String[] args) {
	LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
	map2.put(101, " Mango");
	map2.put(102, " Orange");
	map2.put(103, " Grapes");
	map2.put(108, " Banana");
	map2.put(108, " Lichi");
	map2.put(103, null);
	map2.put(null , null);
	map2.put(null , "Apple");
	map2.put(107, null);
	System.out.println(map2);
	map2.putIfAbsent(102, "CustardApple");
	map2.putIfAbsent(101, "Watermelon");
	System.out.println("------------------------------------------------");
	for (Map.Entry m : map2.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());}
		map2.remove(103);
		System.out.println("------------------------------");
		System.out.println("After removal");
		for (Map.Entry m : map2.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}}
