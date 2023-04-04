package IO;
import java.io.FileOutputStream;
// write String to byte array---- write byte with file output
public class WriteByteFOS {
	
	public static void main(String[] args) {
try {
	// Destination
	FileOutputStream f= new FileOutputStream ("D:\\PRINCE KUMAR.txt");
	String s= " Welcome to Anudip Foundation";
	byte b[] = s.getBytes();// converting string into byte array
	f.write(b);
	f.close();
	System.out.println("Done");
}
catch (Exception e) {
System.out.println(e);
}

	}

}
