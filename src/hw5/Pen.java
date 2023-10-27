package hw5;

public abstract class Pen {
	private String Brand;
	private double price;
	
	public Pen() {
		super();
	}
	
	public Pen(String Brand, double price) {
		this.Brand = Brand;
		this.price = price;
	}
	
	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
	
	public String getBrand() {
		return Brand;
	}

	public void setprice(double price) {
		this.price = price;
	}
	
	public double getprice() {
		return price;
	}
	
	abstract void write();

}
