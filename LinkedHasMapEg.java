package Collection;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHasMapEg {
	public static void main(String[] args) {
LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
map1.put(101, " Mango");
map1.put(102, " Orange");
map1.put(103, " Grapes");
map1.put(108, " Banana");
map1.put(108, " Lichi");
map1.put(103, null);
map1.put(null , null);
map1.put(null , "Apple");
// traversing
for (Map.Entry m : map1.entrySet()) {
System.out.println(m.getKey()+ " "+m.getValue()); }
System.out.println("-------------------------------------------------------------------------");
map1.putIfAbsent(102, "CustardApple");
map1.putIfAbsent(101, "Watermelon");
for (Map.Entry m : map1.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());}
  // key 
	System.out.println("keys"+map1.keySet());
  // value
	System.out.println("Values:"+ map1.values());
//key-value
	System.out.println("keys & values:"+map1.entrySet());
	map1.remove(103);
	System.out.println("After Removal");
	for (Map.Entry m : map1.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}}
	}


