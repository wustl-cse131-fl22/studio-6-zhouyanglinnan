package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		double sum = 0.0;
		
		if (n == 0)
	        return 0;
	    else {
	    	sum = Math.pow(0.5,n);
	        return sum + geometricSum(n-1);
	    }
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int a, int b) {
		int temp = b;
		b = a % b;
		if (b == 0)	{
			return temp;
		}
		else
			temp = gcd(temp,b);
			return temp;
		}
	
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] reversedArray = new int[array.length];
		return trial(array, reversedArray, 0);
	}
	
	public static int[] trial(int[] array, int[] reversedArray, int a) {
		int length = array.length;
	
		if (a == length) {
			return reversedArray;
		}
		else {
			int mirrorIndex = array.length - a - 1;
			reversedArray[a] = array[mirrorIndex];
			return trial(array,reversedArray,a+1);
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
