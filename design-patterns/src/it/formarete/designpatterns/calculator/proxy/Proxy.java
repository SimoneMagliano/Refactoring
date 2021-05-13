
public class Proxy extends CalculatorImpl {
	public int sum(Integer a, Integer b) {
		System.out.println("Input: " + a + ", " + b);

		if (!isValid(a, b)) {
			throw new IllegalArgumentException("Uno o più parametri sono nulli");
		}

}
