
public class TestAnimal {

	public static void main(String[] args) {

		Dog d = new Dog("Hank", "pitbull", 5);
		Cat c = new Cat("Gizmo", "tabby", 4);

		// Print information for dog
		System.out.println(d.toString());
		d.makeNoise("Woof!");
		d.eat("dog");

		System.out.println("--------------------------------");

		// Print information for cat
		System.out.println(c.toString());
		c.makeNoise("Meow");
		c.eat("cat");

	}
}