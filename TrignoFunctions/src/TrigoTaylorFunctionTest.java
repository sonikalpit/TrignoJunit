/*
 *This Testing class is responsible for testing implemented Sin,Cos,Tan methods with In-built Math's functions 
 *to verify the result.
 *
 *@author Team 11 - Azmina, Nithya, Jigish, Kalpit
 *@version 4.0
 *
 */


import static org.junit.Assert.*;

import org.junit.Test;

public class TrigoTaylorFunctionTest {

	//this delta is used to compute whether the assert is true if (Expected - actual) < delta 
	double delta = 0.0001;
	
	/*
	 * This method is responsible to verify the output of powerResult method with Math.pow()
	 * */
	@Test
	public void testPowerResult() {
		assertEquals(Math.pow(2, 3), TrigoTaylorFunction.powerResult(2, 3),delta);
	}

	/*
	 * This method is responsible to verify whether Factorial() functions gives accurate value or not
	 * */
	@Test
	public void testFactorial() {
		assertEquals(120, TrigoTaylorFunction.Factorial(5),delta);
	}

	/*
	 * This method is responsible to check Math.sin() and TrignoSin() output using delta*/
	@Test
	public void testTrignoSin() {
		assertEquals(Math.sin(5), TrigoTaylorFunction.TrignoSin(5),delta);
	}
	/*
	 * This method is responsible to check Math.Cos() and TrignoCos() output using delta*/
	@Test
	public void testTrignoCos() {
		assertEquals(Math.cos(5), TrigoTaylorFunction.TrignoCos(5),delta);
	}
	/*
	 * This method is responsible to check Math.tan() and TrignoTan() output using delta*/
	@Test
	public void testTrignoTan() {
		
		assertEquals(Math.tan(5), TrigoTaylorFunction.TrignoTan(5),0.001);
	}
	
	/*
	 * This method is responsible to verify the Degree value for TrignoSin()
	 * */
	@Test
	public void testTrignoSin1() {
		
		double rad = TrigoTaylorFunction.DegToRad(30);
		assertEquals(0.5000, TrigoTaylorFunction.TrignoSin(rad), delta);
	}
	/*
	 * This method is responsible to verify the Degree value for TrignoCos()
	 * */
	@Test
	public void testTrignoCos1() {
		double rad = TrigoTaylorFunction.DegToRad(30);
		assertEquals(0.8660, TrigoTaylorFunction.TrignoCos(rad), delta);
	}
	/*
	 * This method is responsible to verify the Degree value for TrignoTan()
	 * */
	@Test
	public void testTrignoTan1() {
		double rad = TrigoTaylorFunction.DegToRad(30);
		assertEquals(0.5773, TrigoTaylorFunction.TrignoTan(rad), delta);
	}
	

}
