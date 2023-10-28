package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();

		int[] user = new int[2];
		while (true) { 
			try {
				for (int i = 0; i < 2; ) {
					if (i == 0)
						System.out.println("請輸入x的值: ");
					else
						System.out.println("請輸入y的值: ");
					
					if (sc.hasNextInt()) {
						user[i] = sc.nextInt();
						i++;
					} else {
						System.out.println("輸入格式不正確");
						sc.next();
					}
				}
				int sum = cal.powerXY(user[0], user[1]);
				System.out.println(user[0] + "的" + user[1] + "次方等於" + sum);
				break;
				
			} catch (CalException c) {
				System.out.println(c);
			}
		}
	}

}
