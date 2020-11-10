import static org.junit.Assert.*;

import org.junit.Test;

public class TrigoTaylorFunctionTest {

	double delta = 0.0001;
	
	@Test
	public void testPowerResult() {
		assertEquals(Math.pow(2, 3), TrigoTaylorFunction.powerResult(2, 3),delta);
	}

	@Test
	public void testFactorial() {
		assertEquals(120, TrigoTaylorFunction.Factorial(5),delta);
	}

	@Test
	public void testTrignoSin() {
		assertEquals(Math.sin(2), TrigoTaylorFunction.TrignoSin(2),delta);
	}

	@Test
	public void testTrignoCos() {
		assertEquals(Math.cos(30), TrigoTaylorFunction.TrignoCos(30),delta);
	}
	
	@Test
	public void testTrignoTan() {
		assertEquals(Math.tan(30), TrigoTaylorFunction.TrignoTan(30),delta);
	}
	
	@Test
	public void testTrignoSin1() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrignoCos1() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testTrignoTan1() {
		fail("Not yet implemented");
	}
	

}
