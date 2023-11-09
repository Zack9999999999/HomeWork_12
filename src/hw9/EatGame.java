package hw9;

public class EatGame {

	public static int r() {
		return (int) (Math.random() * (3000 - 500 + 1)) + 500;
	}

	public static void main(String[] args) {

		SteamedBunMan sbm = new SteamedBunMan();
		Thread t1 = new Thread(sbm);

		James j = new James();
		Thread t2 = new Thread(j);

		System.out.println("----大胃王快食比賽開始!----");
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("----大胃王快食比賽結束!----");
	}

}

class SteamedBunMan implements Runnable {
	int count = 1;

	public SteamedBunMan() {

	}

	public void run() {
		while (count <= 10) {
			System.out.println("饅頭人吃第" + count + "碗飯");
			count++;
			try {
				Thread.sleep(EatGame.r());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("饅頭人吃完了!");
	}
}

class James implements Runnable {
	int count = 1;

	public James() {

	}

	public void run() {
		while (count <= 10) {
			System.out.println("詹姆士吃第" + count + "碗飯");
			count++;
			try {
				Thread.sleep(EatGame.r());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("詹姆士吃完了!");
	}
}
