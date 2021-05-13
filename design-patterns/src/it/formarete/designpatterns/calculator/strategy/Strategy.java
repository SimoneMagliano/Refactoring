
public class Strategy extends CalculatorImpl {
	
	if (!isValid(a, b)) {
		throw new IllegalArgumentException("Uno dei due parametri è nullo");
	}
	private boolean isValid(Integer a, Integer b) {
		return a != null & b != null;
	}
}
