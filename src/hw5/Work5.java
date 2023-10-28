package hw5;

import java.util.Arrays;

public class Work5 {

//1.請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，
//即會印出對應的*長方形，如圖：

//	public void starSquare(int width, int height) {
//
//		for (int i = 0; i < height; i++) {
//			for (int j = 0; j < width; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//	}

//2.請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，
//如圖：

//	public void randAvg() {
//		int[] x = new int[10];
//		int sum = 0;
//
//		for (int i = 0; i < x.length; i++) {
//			x[i] = (int) (Math.random() * 101);
//			System.out.print(x[i] + " ");
//			sum += x[i];
//		}
//		System.out.println();
//		sum /= x.length;
//		System.out.println("平均值為: " + sum);
//
//	}

//3.利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，如圖：

//	public int maxElement(int x[][]) {
//
//		int max = 0;
//
//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < x[i].length; j++) {
//				if (x[i][j] > max) {
//					max = x[i][j];
//				}
//			}
//
//		}
//		return max;
//
//	}

//	public double maxElement(double x[][]) {
//
//		double max = 0;
//
//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < x[i].length; j++) {
//				if (x[i][j] > max) {
//					max = x[i][j];
//				}
//			}
//
//		}
//		return max;
//	}
//排序解法 有空再看怎用
//	for (int i = 0; i < x.length; i++) {
//	Arrays.sort(x[i]);
//}
//x[i].length - 1 最後一個元素的位置

//5.身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合，如圖

	public void getAuthCode() {

		String n = "";

		for (int i = 0; i < 8; i++) {
			
			int ran = (int) (Math.random() * 10); // 0-9
			int ran2 = (int) (Math.random() * 26) + 65; // 65-90 大寫英文
			char rann2 = (char) ran2; // 轉字元
			int ran3 = (int) (Math.random() * 26) + 97; // 97-122 小寫英文
			char rann3 = (char) ran3; // 轉字元
			int rrr = (int) (Math.random() * 3) + 1; //抽1-3
			switch (rrr) {
			case 1:
				n += ran;
				break;
			case 2:
				n += rann2;
				break;
			case 3:
				n += rann3;
				break;
			}
		}
		System.out.println("本次隨機產生驗證碼為: " + n);
	}

	public static void main(String[] args) {

//1.請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，
//即會印出對應的*長方形，如圖：	

		Work5 w = new Work5();
//
//		w.starSquare(5, 2);
//
//		System.out.println("================================================");

//2.請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，
//如圖：

//		w.randAvg();
//
//		System.out.println("================================================");

//3.利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，如圖：

//		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
//
//		double[][] doubleArray = { { 1.2, 8.2, 2.2 }, { 7.4, 2.1, 3.5 } };
//
//		int bigOne = w.maxElement(intArray);
//		double bigTwo = w.maxElement(doubleArray);
//
//		System.out.println("最大值: " + bigOne);
//		System.out.println("最大值: " + bigTwo);
//
//		System.out.println("================================================");

//5.身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合，如圖

		w.getAuthCode();
	}
}
