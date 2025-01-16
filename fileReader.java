package FileHandling;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\printfile.txt");
		int i;
		while ((i=fr.read())!=-1) {
			System.out.println((char)i);
			
		}
		

	}

}
