package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Work4 {
//	有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)

	public static void main(String[] args) {

		Work4One one = new Work4One();

		one.avg();

		System.out.println("\n" + "===================================");

//	請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
//	(提示：String方法，陣列)

		
		
//	有個字串陣列如下 (八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//	(提示：字元比對，String方法)

//		String[] eight = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//
//		int x = 0; // 母音數量
//		String y = "";
//		for (int i = 0; i < eight.length; i++) {
//			y += eight[i]; // 疑問:為什麼這樣是串接?//
//		}
//		for(int i = 0; i < y.length(); i++) {
//			char aeiou = y.charAt(i);
//			if(aeiou == 'a' || aeiou == 'e' || aeiou == 'i' || aeiou == 'o' || aeiou == 'u') {
//				x++;
//			}
//		}
//		System.out.println("aeiou總共有: " + x);
//
//		System.out.println("\n" + "===================================");

//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下：
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		(提示：Scanner，二維陣列)

		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();

		int howmany = 0; // 記人數

		int[][] people = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		System.out.print("有錢可借的員工編號: ");

		for (int i = 0; i < people.length; i++) {
			for (int j = 0; j < people[i].length; j++) {
				if (i == 1 && people[1][j] >= money) {
					System.out.print(people[0][j] + " ");
					howmany++;
				}
			}
		}
		System.out.println("共 " + howmany + " 人!");

//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

//		int ymd = sc.nextInt();
//		int date = 365;
	}
}
