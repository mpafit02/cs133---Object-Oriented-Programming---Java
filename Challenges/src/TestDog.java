
public class TestDog {

	public static void main(String[] args) {
		Dog dog = new Dog("Max");
		System.out.println(dog.eat(100));
		Dog dog2 = new Dog("John");
		Dog.Food f = dog2.new Food(50);
		System.out.println(f.getAmount());
		dog.hello();
		f.hello();
		dog.callHello();
		f.callHello();
	}

}
