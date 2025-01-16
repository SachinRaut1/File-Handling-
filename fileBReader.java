package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileBReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\printfile.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null)
		{
			System.out.println(str);
			
		}

	}

}
