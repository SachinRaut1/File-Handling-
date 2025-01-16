package FileHandling;
import java.io.*;
import java.io.FileWriter;
public class bufferedFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\bufferfile.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("ho gaya re hogaya my love my love jane ja yo my love");
		bw.newLine();
		bw.write("i this is sachin raut from lonar ");
		bw.newLine();
		
		bw.close();
		fw.close();

	}

}
