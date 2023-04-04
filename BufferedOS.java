package IO;
import java.io.*;
/*write information in the BufferredOutputStream object which is
 * connected to the FileOutputStream object.*/
public class BufferedOS {
		public static void main(String[] args) {
	try {
		// we connected one stream(FileOutputStream) with another 
		FileOutputStream f= new FileOutputStream ("D:\\4120.txt");
		BufferedOutputStream b =new BufferedOutputStream (f);
		String s= " Welcome to Coding World";
		byte b1[] = s.getBytes();// converting string into byte array
		f.write(b1);
		b.flush(); //flushes the data of one stream and send it into another
		f.close();
		b.close();
		System.out.println("Done");
	}
	catch (Exception e) {
	System.out.println(e);
	}

	}

}
