package Builder_Pattern;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMap {
	protected static Map<Integer, String> doubleBracket() {
		return Collections.unmodifiableMap(new HashMap<Integer, String>() {
			{
				put(0, "zero");
				put(1, "one");
				put(2, "two");
				put(3, "three");
				put(4, "four");
				put(5, "five");
				put(6, "six");
				put(7, "seven");
				put(8, "eight");
				put(9, "nine");
				put(10, "ten");
				put(11, "eleven");
				put(12, "twelve");
			}
		});
	}

	public static void main(String[] args) {
		HashMap<Integer, String> doubleBracketMap = new HashMap<>(doubleBracket());
		System.out.println("Using the double bracket approach: " + doubleBracketMap.get(0));
	}
}
