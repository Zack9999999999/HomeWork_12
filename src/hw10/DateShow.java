package hw10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateShow {

	public static void main(String[] args) throws ParseException {

		String regex = "^\\d{4}[0 1]\\d[1-3]\\d$";
		String s1 = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期(年月日,例如:20110131)");

		while (true) {
			s1 = sc.next();

			if (s1.matches(regex))
				break;
			else
				System.out.println("日期格式不正確,請再輸入一次");

		}
		System.out.println("欲格式化成(1)年/月/日 (2)月/日/年 (3)日/月/年");
		int format = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = sdf.parse(s1);

		SimpleDateFormat sdfall = null;

		if (format == 1) {
			sdfall = new SimpleDateFormat("yyyy/MM/dd");
		} else if (format == 2) {
			sdfall = new SimpleDateFormat("MM/dd/yyyy");
		} else if (format == 3) {
			sdfall = new SimpleDateFormat("dd/MM/yyyy");
		}

		String answer = sdfall.format(date);

		System.out.println(answer);

		sc.close();
	}
}
