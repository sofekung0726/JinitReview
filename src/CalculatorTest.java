import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
		void testAddNumber() {
			Calculator c1 = new Calculator();
			c1.addNumber(6, 6);
			assertEquals(12,c1.getResult());
		}
	

}
