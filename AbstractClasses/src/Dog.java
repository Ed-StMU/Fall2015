
public class Dog extends Animal {

	public Dog(String name, String breed, int age) {
		super(name, breed, age);
	}

	public void makeNoise(String noise) {
		System.out.println(noise);
	}

	public void eat(String animal) {
		System.out.println("The " + animal + " eats its food.");
	}

	public String toString() {
		return super.toString();
	}
}
