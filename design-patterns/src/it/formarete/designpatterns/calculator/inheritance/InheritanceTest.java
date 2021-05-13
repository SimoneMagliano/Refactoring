
public class InheritanceTest {
	@Test
	public void testValidInput() {
		Calculator calc = new ValidatingCalculator();
		assertEquals(5, calc.sum(2,3));
	}
	public void testInvalidInput() {
		Calculator calc = new ValidatingCalculator();
		assertThrows(IllegalArgumentException.class,()->calc.sum(null,3));
	}
}
