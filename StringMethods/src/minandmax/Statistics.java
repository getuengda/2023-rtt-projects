package minandmax;

import java.util.Arrays;

public class Statistics {
	// class level variable / field similar to local except
		//	Fields can be accessed anywhere within the class definition.
		//	Fields can be given access specifiers.
		//	Class variables are members of Class, and 
		//	local variables are members of method.
		//	Fields must declare a default value for local variables.

	private double min = Double.MAX_VALUE;
	private double max = Double.MIN_VALUE;
	private double sum = 0; 
	private int nSamples = 0;

	public Statistics(double[] values) {
		for(int i = 0; i<values.length; i++) {
			double v = values[i];
			if(v < min) min = v;
			if(v > max) max = v;
			sum += v;
			nSamples++;
		}
		
	}
	
	public static void main(String[] args) {
		double[] values = new double[10];
		for(int i = 0; i <10; i++) {
			values[i] = Math.random()*100;
		}
		System.out.println(Arrays.toString(values));

	}

}
