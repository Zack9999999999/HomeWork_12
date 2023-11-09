package hw9;

public class Money {

	public static void main(String[] args) {

		Bank bank = new Bank();

		BearMom bm = new BearMom(bank);
		Thread bm1 = new Thread(bm);

		BadBear bb = new BadBear(bank);
		Thread bb1 = new Thread(bb);
		bm1.start();
		bb1.start();
	}
}

class BearMom implements Runnable {

	Bank bank;

	public BearMom(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			bank.give(2000);
		}
	}
}

class BadBear implements Runnable {

	Bank bank;

	public BadBear(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			bank.take(1000);
		}
	}
}

class Bank {

	private int money = 0;

	synchronized public void give(int mon) {

		while (money > 3000) {
			System.out.println("媽媽看到餘額在3000以上,不給了");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money += mon;
		System.out.println("媽媽存了" + mon + ",帳戶共有:" + money);
		System.out.println("壞熊被媽媽告知有錢花了!");
		notify();
	}

	synchronized public void take(int mon) {
		if (money == 0) {
			System.out.println("壞熊看到帳戶見底,暫停乞討");
			notify();
			System.out.println("媽媽被壞熊乞討!");

		}
		while (money < 2000) {
			System.out.println("壞熊看到餘額在2000以下,開始乞討");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money -= mon;
		System.out.println("壞熊領了" + mon + ",帳戶共有:" + money);
		notify();

	}
}