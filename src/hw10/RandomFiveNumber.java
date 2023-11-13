package hw10;

public class RandomFiveNumber {

// 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否為質數
// 除了1和該數自身外，無法被其他自然數整除的數

	public static void randomNumber(int number) {

		boolean isPrime = true;

		for (int j = 2; j < number; j++) {
			if (number != 1 && number % j == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(number + "是質數");
		else
			System.out.println(number + "不是質數");
	}

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			int number = (int) (Math.random() * 100) + 1;

			randomNumber(number);
		}
	}
}
