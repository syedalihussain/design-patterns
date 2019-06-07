package Singleton_Pattern;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	@Override
	public void run() {

		Singleton firstInstance = Singleton.getInstance();

		System.out.println("Instance ID: " + System.identityHashCode(firstInstance));

		System.out.println(firstInstance.getLetterList());

		LinkedList<String> playerOneTiles = firstInstance.getTiles(7);

		System.out.println("Player 1 tiles" + playerOneTiles);

		System.out.println("Got Tiles");
	}
}
