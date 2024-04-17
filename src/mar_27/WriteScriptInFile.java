package mar_27;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;




public class WriteScriptInFile {

	public static void main(String[] args) throws Throwable {
		//create  a file
		File f = new File("D:/mrngbatch.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I want job in top MNC");
		bw.newLine();
		bw.write("with20l package");
		bw.newLine();
		bw.write("with hardwork and practice");
		bw.flush();
		bw.close();

	}

}
