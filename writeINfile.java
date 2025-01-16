package FileHandling;
import java.io.FileWriter;
import java.io.*;
public class writeINfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\file1.txt");
		fw.write("I am Santosh \n");
		fw.write("I am from pune \n");
		fw.write("I want to become Java Developer");
		fw.close();
		
		

		
		

	}

}
