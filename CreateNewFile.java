package FileHandling;
import java.io.*;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\file.txt");
		boolean newFile = f.createNewFile();
		
		if (newFile) {
			System.out.println("file created succesfully");
			
		}
		
		else {
			System.out.println("file not created");
		}

	} 

}
