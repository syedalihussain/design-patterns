package Strategy_Pattern;

public class Dog extends Animal {

	public Dog() {
		super();
		flyingType = new CantFly();
	}
}
