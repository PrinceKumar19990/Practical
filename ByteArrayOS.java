package IO;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* ByteArrayInputStream class is used to write same data into multiple files the data
 * is written into a byte array, which can be written stream later.*/
public class ByteArrayOS {
public static void main(String[] args) throws IOException {
		// can be written to multiple stream
	FileOutputStream f1 =new FileOutputStream ("D:\\sample.txt");
	FileOutputStream f2 =new FileOutputStream ("D:\\sample1.txt");
	ByteArrayOutputStream bout = new ByteArrayOutputStream();
	bout.write(65); //Ascii value 65 means -A
	bout.writeTo(f1);
	bout.writeTo(f2);
	bout.flush();
	bout.close();
	System.out.println("done");

}}
