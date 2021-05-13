
public class ProxyTest {
	@Test
	public void testValidInput() {
		Calculator calc = new ValidatingCalculator();
		assertEquals(5, calc.sum(2,3));
	}
}
