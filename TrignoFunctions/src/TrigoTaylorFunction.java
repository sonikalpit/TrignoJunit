/*
 *This class is responsible for computing Sin, Cos, Tan functions by implementing required functions such
 *as Power function, Factorial functions which are required for implementing Taylor series.
 *
 *@author Team 11 - Azmina, Nithya, Jigish, Kalpit
 *@version 4.0 
 *
 */

import java.util.Scanner;

public class TrigoTaylorFunction {
	
	// Conversion of Degree input to Radian
	public static double DegToRad(double deg1)
	{
		return (2*deg1*pi)/angle;
	}
	// Normalizing radian to make input calculatable
	public static double RadNormalize(double rad1)
	{
		return (rad1 % (2*pi));
	}
	/*
	 * It computes power in which user will enter base and power
	 * if negative is there then it will throw the exception 
	 * if successfully runs then it will return base n times where n is power*/
	public static double powerResult(double base,double power)
	{
		double answer = 1;
		try 
		{
			if(power==0)
			{
				return 1;
			}
			if(power<0)
			{
				throw new Exception("Negative!! Invalid!!");
			}
			else
			{
				for(int i=1;i<=power;i++)
				{
					answer = answer * base;
				}
			}
			return answer;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	return answer;
		
	}
	/*
	 * This factorial function returns the result of positive numbers as taylor series requires it in denominator
	 */
	public static long Factorial(int den)
	{
		long fact = 1;
		try
		{
			if(den<0)
			{
				throw new Exception("Negative!!");
			}
			else
			{
				for(int i=1;i<=den;i++)
				{
					fact = fact * i;
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return fact;
	}
	/*
	 * this method returns the sin value of any angle where radinput is an angle provided by user
	 * */
	public static double TrignoSin(double radinput)
	{
		/*
		 * taylor series for sin is summation of (-1)n* x(2n+1)/ fact(2n+1)
		 * */
		sinResult = 0;
		double calNormedAngle = RadNormalize(radinput);
		
		
		for(int i=1;i<=10;i++)
		{
			
			
			sinResult = sinResult + (powerResult(-1, i-1) * powerResult(calNormedAngle, (2*i)-1) / Factorial((2*i)-1));
		}
		
		return sinResult;
	}
	/*
	 * this method returns the cos value of any angle where radinput is an angle provided by user
	 * */
	public static double TrignoCos()
	{
		/*
		 * taylor series for cos is summation of (-1)n * x(2n)/(2n)!
		 * */
		cosResult=0;
		double calNormedAngle = RadNormalize(radinput);
				
		for(int i=1;i<=10;i++)
		{
			cosResult = cosResult + (powerResult(-1, i-1) * powerResult(calNormedAngle, 2*(i-1)) / Factorial(2*(i-1)));
		}
		
		return cosResult;
  	}
	/*
	 * this method returns the Tan value of any angle where radinput is an angle provided by user
	 * */
	public static double TrignoTan()
	{
		/*
		 * As the formula to compute Tan is simple that is Tan(x) = Sin(x)/Cos(x)
		 * */
		TanResult = 0;
		TanResult = (TrignoSin(radinput)/TrignoCos(radinput));
		return TanResult;
	}

}
