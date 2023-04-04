package IO;
// we can read all character - using FileInputStream
import java.io.FileInputStream;
// read all character
public class AllcharFIS {
	public static void main(String[] args) {
	try {
		FileInputStream f =new FileInputStream ("D:\\\\4120.txt");
		int i=0;
		while ((i=f.read())!=-1) {
			System.out.print((char)i); //convert it into character
		}
		f.close();
	} catch (Exception e) {
		System.out.println(e);
	}

	}

}
