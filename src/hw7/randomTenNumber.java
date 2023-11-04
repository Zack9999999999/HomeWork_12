package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class randomTenNumber {

	public static void main(String[] args) throws IOException {

		// 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
		// append功能讓每次執行結果都能被保存起來)

		FileWriter da = new FileWriter("src/hw7/Data.txt", true);

		BufferedWriter bufwr = new BufferedWriter(da);

		PrintWriter pr = new PrintWriter(bufwr);

		for (int i = 0; i < 10; i++) {
			int ten = (int) (Math.random() * 1000) + 1;
			pr.println(ten);

			bufwr.flush(); //疑問:沒加這行會Writer不進Data.txt
							//解答:改用print即可解決
		}

		pr.close();
		bufwr.close();
		da.close();
	}
}
