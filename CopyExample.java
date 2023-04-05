package IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class CopyExample {
	public static void main(String[] args) {
	try {
		FileInputStream fin = new FileInputStream ("D:\\4111.txt");//read ( prince kumar)
		FileOutputStream fout = new FileOutputStream ("D:\\4110.txt"); // write
		byte[] arr =new byte[1024];
		int l;
		while ((l=fin.read(arr))>0) {
	    fout.write(arr);
		}
		fin.close();
		fout.close();System.out.println("done");
	}
	catch (Exception e) {
		System.out.println(e);
	}

	}

}
