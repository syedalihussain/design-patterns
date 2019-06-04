public class Animal {

	private String name;
	private double height;
	private int weight;
	private String sound;

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("weight must be bigger than 0");
		}

	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getSound() {
		return sound;
	}




}
