package Singleton_Pattern;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {

	private static Singleton firstInstance = null;

	String[] scrabbleLetters = {"a", "a", "a", "a", "a", "b", "b", "b", "b",
								"c", "c", "c", "c", "d", "d", "d", "d", "e",
								"f", "f", "f", "f", "f", "g", "g", "g", "g"};

	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

	static boolean firstThread = true;


	private Singleton() {}

	public Singleton getFirstInstance() {
		if (firstInstance == null) {

			if (firstThread) {
				firstThread = false;

				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			firstInstance = new Singleton();
		}
		return firstInstance;
	}


}
