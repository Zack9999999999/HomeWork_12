package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {

		MyRectangle rectangle = new MyRectangle();
		
		rectangle.setWidth(10);
		rectangle.setDepth(20);
		
		System.out.println(rectangle.getArea());
		
		MyRectangle rectangle2 = new MyRectangle(10, 20);
		
		System.out.println(rectangle2.getArea());
		
	}

}
