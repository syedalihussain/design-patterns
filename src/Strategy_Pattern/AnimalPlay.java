package Strategy_Pattern;

public class AnimalPlay {

	public static void main(String[] args) {
		Animal spikey = new Dog();
		System.out.println(spikey.tryToFly());
	}
}
