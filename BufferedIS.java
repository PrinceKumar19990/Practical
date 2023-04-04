package IO;
import java.io.*;
// read the data from source file by using BufferedInputStream
public class BufferedIS {
	public static void main(String[] args) {
		try {
  // Source file
	FileInputStream f =new FileInputStream ("D:\\4121.txt");
    BufferedInputStream b =new BufferedInputStream(f);
    int i;
    while ((i=b.read())!=-1) {
    	System.out.print((char)i); // convert it into character
    }
    f.close();
    b.close();
	} catch (Exception e) {
		System.out.println(e);
	}
	}
}
