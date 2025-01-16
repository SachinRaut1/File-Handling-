package FileHandling;
import java.io.*;
public class FileExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\file1.txt");
		System.out.println(f.exists());//false because file is not createsd

	}

}
