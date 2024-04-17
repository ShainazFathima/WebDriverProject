package mar_27;
import java.io.*;

public class ReadDataInFile {

	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("D:/mrngbatch.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null) {
			Thread.sleep(5000);
			System.out.println(str);
		}

	}

}
