package Strategy_Pattern;

public interface Flys {

	String fly();
}

class ItFlys implements Flys {
	@Override
	public String fly() {
		return "It flys";
	}
}

class CantFly implements Flys {
	@Override
	public String fly() {
		return "Can't fly";
	}
}
