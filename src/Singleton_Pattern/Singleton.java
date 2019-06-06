package Singleton_Pattern;

public class Singleton {

	private static Singleton firstInstance = null;

	private Singleton() {}

	public Singleton getFirstInstance() {
		if (firstInstance == null) {
			firstInstance = new Singleton();
		}
		return firstInstance;
	}

	
}
