package FileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\file.txt");
		System.out.println(f.delete());

	}

}
