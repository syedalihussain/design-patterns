package Builder_Pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Maps {

	private Maps() {

	}

	public static <K, V> MapBuilder<K, V> builder() {
		return builder(HashMap::new);
	}

	public static <K, V> MapBuilder<K, V> builder(Supplier<Map<K, V>> mapSupplier) {
		return new MapBuilder<>(mapSupplier.get());
	}

	private static class BaseBuilder<M extends Map<K, V>, K, V> {


		protected final M map;

		public BaseBuilder(M map) {
			this.map = map;
		}
	}

	//	This is some Random Text
}
