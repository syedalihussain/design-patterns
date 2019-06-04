package Strategy_Pattern;

public abstract class Animal {

	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}

	public String tryToFly() {
		return flyingType.fly();
	}

	public Flys flyingType;


}
