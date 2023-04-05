package IO;
import java.io.FileReader;
import java.io.FileWriter;
public class FileWriterExample {
	public static void main(String[] args) {
	try {
	FileWriter fw = new FileWriter("D:\\4122.txt");
	 fw.write(" welocome to anudeep foundation skill development center");
	 FileReader fr= new FileReader("D:\\4122.txt");
	 int i=0;
	 while((i=fr.read())!=-1) {
		 System.out.println((char)i);
	 }
	 fw.close();
	 fr.close();
	 System.out.println("done");
	}catch (Exception e) {
		System.out.println(e);
	}

	}

}
