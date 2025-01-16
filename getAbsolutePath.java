package FileHandling;
import java.io.*;
public class getAbsolutePath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\file.txt");
		System.out.println(f.getAbsolutePath());//path
		System.out.println(f.getCanonicalPath());//path
		System.out.println(f.getFreeSpace());
		System.out.println(f.getName());//file.txt
		System.out.println(f.getParent());//desktop
		System.out.println(f.getPath());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());
		System.out.println(f.getClass());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalFile());
		System.out.println(f.getParentFile());
		System.out.println(f.getParentFile());

	}

}
