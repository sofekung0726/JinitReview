import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;

public class CalculatorTest3 extends TestCase {
	Calculator c1;
	protected void setUp() throws Exception {
		c1 = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testAddNumber() {
		c1.addNumber(6, 6);
		assertEquals (12,c1.getResult());
	}
}
