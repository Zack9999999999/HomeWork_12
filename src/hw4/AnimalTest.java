package hw4;

public class AnimalTest {
	
	public static void main(String[] args) {

		Animal ani = new Animal(2, 5.0f);
		ani.speak();
		
		ani.setAge(5);
		ani.setWeight(10.0f);
		ani.speak();
	}
}
