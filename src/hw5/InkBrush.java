package hw5;

public class InkBrush extends Pen {

	public InkBrush() {
		super();
	}

	public InkBrush(String Brand, double price) {
		super(Brand, price);
	}

	public double getprice() {
		return super.getprice() * 0.9;
	}

	public void write() {
		System.out.println("沾墨汁再寫");
	}
}
