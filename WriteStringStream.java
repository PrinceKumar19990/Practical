package IO;
import java.io.FileOutputStream;
// write String to byte array---- write byte with file output
public class WriteStringStream {
public static void main(String[] args) {
	try {
		// write Byte to string
		FileOutputStream f= new FileOutputStream ("D:\\4119.txt");
		// write Byte to String
		f.write(82); // byte value (Ascii value)
		f.close();
		System.out.println("Done");
	}
	catch (Exception e) {
	System.out.println(e);
}
}
}
