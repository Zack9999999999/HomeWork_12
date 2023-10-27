package hw5;

public class Pencil extends Pen {

	public Pencil() {
		super();
	}

	public Pencil(String Brand, double price) {
		super(Brand, price);
	}

	public double getprice() {
		return super.getprice() * 0.8;
	}

	public void write() {
		System.out.println("削鉛筆再寫");
	}
}
