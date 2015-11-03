package kodune;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	private Calc c;

	@Before
	public void setUp() throws Exception {
		c = new Calc();
	}

	@Test
	public void testPayJunior() {
		assertEquals(c.pay(1, 5), 50);
		assertEquals(c.pay(1, 10), 120);
		assertEquals(c.pay(1, 24), 410);
	}
	
	@Test
	public void testPaySenior() {
		assertEquals(c.pay(2, 5), 75);
		assertEquals(c.pay(2, 10), 180);
		assertEquals(c.pay(2, 24), 620);
	}
	
	@Test
	public void testPaySpecialist() {
		assertEquals(c.pay(3, 5), 110);
		assertEquals(c.pay(3, 10), 264);
		assertEquals(c.pay(3, 24), 1218);
	}

}
