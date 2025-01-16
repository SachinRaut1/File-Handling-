package FileHandling;
import java.io.*;
public class FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\file.txt");
		System.out.println(f.canWrite());//boolean type
		System.out.println(f.canRead());//true we cn read the data
		System.out.println(f.exists());
		
		

	}

}
