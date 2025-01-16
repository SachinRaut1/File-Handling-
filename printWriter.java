package FileHandling;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class printWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\printfile.txt");
		PrintWriter pw=new PrintWriter(fw);
		
		pw.println("hi my self sachin raut");
		pw.println("i am from pune");
		
		pw.close();
		fw.close();

	}

}
