package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SampleTest {

	public static void main(String[] args) throws IOException {

//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

//		C:/CHA104_Workspace/HomeWork_12/src/hw7/ 絕對路徑

		File sam = new File("src/hw7/Sample.txt");
		System.out.println(sam.length() + "個位元組");

		String charrr; // 存readLine
		int charsum = 0; // 存每列有多少字元

		String s; // 存readLine
		int line = 0; // 存有幾列

		FileReader readSam = new FileReader(sam);

		BufferedReader buf = new BufferedReader(readSam);

		while ((charrr = buf.readLine()) != null) {
			charsum += charrr.length(); // 將每列有多少字累加
		}
		System.out.println(charsum + "個字元");

		while ((s = buf.readLine()) != null) {
			line++; // 跑完一列就累加一次
		}
		System.out.println(line + "列資料");

		buf.close();
		readSam.close();

	}
}