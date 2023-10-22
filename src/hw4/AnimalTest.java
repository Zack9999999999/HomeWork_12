package hw4;

public class AnimalTest {

	public static void main(String[] args) {

		Animal ani = new Animal(3, 8.0f);
		Elephant ele = new Elephant(8, 1200.0f, "大象");
		ani.speak();
		ele.speak();

	}
}
