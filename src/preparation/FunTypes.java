package preparation;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunTypes {

	public static void main(String[] args) {

		Function<Integer, String> y = x -> x * 2 + "is a num";
		System.out.println(y.apply(4));

		Predicate<String> x = u -> u.length() >= 5;
		System.out.println(x.test("Dhoni"));

		Supplier<Double> s = () -> Math.random();
		{
			System.out.println(s.get());

			Consumer<Integer> n = h -> System.out.println(h + 100);
			n.accept(200);
			

		}

	}

}
