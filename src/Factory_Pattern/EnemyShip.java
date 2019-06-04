package Factory_Pattern;

public abstract class EnemyShip {

	private String name;
	private double damage;

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void followHeroShip() {
		System.out.println(getName() + " is following hero.");
	}

	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen.");
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + getDamage());
	}
}
