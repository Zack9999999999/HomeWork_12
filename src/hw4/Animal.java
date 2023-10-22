package hw4;

public class Animal {

	private int age;
	private float weight;

	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;

	}

	public void speak() {
		System.out.println("年齡: " + age);
		System.out.println("體重: " + weight);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}

}
