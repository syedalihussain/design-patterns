package Factory_Pattern;

import java.util.Scanner;

public class EnemyShipTesting {
	public static void main(String[] args) {

		EnemyShipFactory shipFactory = new EnemyShipFactory();

		System.out.println("What type of Enemy Ship?");
		Scanner sc = new Scanner(System.in);
		String shipType = sc.nextLine();

		EnemyShip enemyShip = shipFactory.makeEnemyShip(shipType);
		doStuffEnemy(enemyShip);
	}

	public static void doStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}
