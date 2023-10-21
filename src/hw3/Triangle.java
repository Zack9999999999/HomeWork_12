package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {

	Scanner sc = new Scanner(System.in);

//1.將使用者輸入的3個數值存入int[] x 並做排序,完成後return到main方法內的int[] x 儲存
	public int[] getThree() {
		int[] x = new int[3];
		for (int i = 0; i < 3;) {
			if (sc.hasNextInt()) {
				x[i] = sc.nextInt();
				i++;
			} else
				sc.next();
		}
		Arrays.sort(x);

		return x;
	}

//將main方法以儲存好的int[] x 帶過來執行方法
//ps.此處的int[] x 變數名稱跟main方法無相關,可自行定義
	public void setThreeTime(int[] x) {

		if (x[0] == x[1] && x[1] == x[2]) {
			System.out.println("正三角形");
		} else if (x[0] == x[1] && x[2] > x[1]) {
			System.out.println("等腰三角形");
		} else if (x[0] < x[1] && x[1] < x[2]) {
			System.out.println("其他三角形");
		} else if (x[0] * x[0] + x[1] * x[1] == x[2] * x[2]) {
			System.out.println("直角三角形");
		} else if (x[0] + x[1] <= x[2])
			System.out.println("不是三角形");
	}
}
