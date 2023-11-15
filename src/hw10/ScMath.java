package hw10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

//請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示
//(1)千分位(2)百分比(3)科學記號，
//而輸入非任意數會顯示提示訊息如圖 (提示： TestFormatter.java, Java API文件, 
//判斷數字可用正規表示法)

public class ScMath {

	public static void main(String[] args) {

		double number = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字:");

		while (true) {
			if (sc.hasNextDouble()) {
				number = sc.nextDouble();
				break;
			}
			System.out.println("數字格式不正確,請重新輸入");
			sc.next();
		}

		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
		int s1 = sc.nextInt();

		if (s1 == 1) {
			Format n1 = new DecimalFormat("#,###");
			System.out.println("千分位: " + n1.format(number));
		} else if (s1 == 2) {
			Format n2 = new DecimalFormat("##%");
			System.out.println("百分比: " + n2.format(number));
		} else if (s1 == 3) {
			Format n3 = new DecimalFormat("0.0E0");
			System.out.println("科學記號: " + n3.format(number)); // ??

		}

//		switch (s2) {
//
//		case 1:
//			Format n1 = new DecimalFormat("#,###");
//			System.out.println(n1.format(number1));
//		case 2:
//			Format n2 = new DecimalFormat("##%");
//			System.out.println(n2.format(number1));
//		case 3:
//			System.out.printf("科學記號數字: %E",number1 );

		sc.close();
	}

}
