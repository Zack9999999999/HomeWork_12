package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔案

	public void copyFile(String one, String two) throws IOException {
		File fil1 = new File(one);
		File fil2 = new File(two);

		String s;

		FileReader read = new FileReader(fil1);
		BufferedReader bufread = new BufferedReader(read);

		FileWriter writ = new FileWriter(fil2);
		BufferedWriter bufwrit = new BufferedWriter(writ);

		while ((s = bufread.readLine()) != null) {
			bufwrit.write(s);
			bufwrit.flush();
		}

		bufwrit.close();
		writ.close();
		bufread.close();
		read.close();

	}

	public static void main(String[] args) throws IOException {

		Copy c = new Copy();

		c.copyFile("src/hw7/Sample.txt", "src/hw7/CopySample.txt");

	}
}
