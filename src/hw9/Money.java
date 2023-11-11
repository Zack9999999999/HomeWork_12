package hw9;

import java.util.concurrent.locks.ReentrantLock;

public class Money {

	public static void main(String[] args) {

		Bank bank = new Bank();

//		BearMom bm = new BearMom(bank);
		Thread bm1 = new Thread(new BearMom(bank));

//		BadBear bb = new BadBear(bank);
		Thread bb1 = new Thread(new BadBear(bank));
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
		for (int i = 1; i <= 10; i++) {
			System.out.println("mom跑了" + i + "次");
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
		for (int i = 1; i <= 10; i++) {
			System.out.println("bear跑了" + i + "次");
			bank.take(1000);
		}
	}
}

class Bank {

//	private static final ReentrantLock LOCK = new ReentrantLock();
	private int money = 0;
	int count = 0;

	synchronized public void give(int mon) {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		if (count == 10 && money > 3000) {
//			money += mon;
//			System.out.println("1.媽媽存了" + mon + ",帳戶共有:" + money);
//		}
		if (money > 3000) {
			System.out.println("1.媽媽看到餘額在3000以上,不給了");
			notify();
			System.out.println("1.壞熊被媽媽告知有錢花了!");
			try {
				if (count == 10)
					return;
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money += mon;
		System.out.println("1.媽媽存了" + mon + ",帳戶共有:" + money);
	}

	synchronized public void take(int mon) {

		count++;
//		System.out.println("count = " + count);

		if (count == 10)
			notify();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (money < 2000) {
			System.out.println("2.壞熊看到餘額在2000以下,開始乞討");
		}
		if (money == 0) {
			System.out.println("2.壞熊看到帳戶沒錢,暫停領錢");
			notify();
			System.out.println("2.媽媽被壞熊乞討!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money -= mon;
		System.out.println("2.壞熊領了" + mon + ",帳戶共有:" + money);
	}
}

//次數問題
//bear跑完10次 導致mom跑到第7次後執行到wait() 卡住