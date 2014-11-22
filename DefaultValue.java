package com.arrays;

public class DefaultValue {

	public static void main(String[] args){
		
		// When you declared and constructed an array of primitives
		// all variables in the array will get default values as initial values
		
		boolean[] b = new boolean[3];
		char[] c = new char[3];
		double[] d = new double[4];
		int[] i =  new int[5];
		long[] l = new long[3];
		
		// boolean - false 
		System.out.println("default value for boolean: "+b[0]); 
		// (special case) character - It prints a little square(not a printable character) 
		System.out.println("default value for char: "+c[0]);
		// double - 0.0
		System.out.println("default value for double: "+d[0]);
		// int - 0
		System.out.println("default value for int: "+i[0]);
		// long - 0
		System.out.println("default value for long: "+l[0]);
		
		// Finally short & byte are similar to int, float is similar to double 
		
		// Similarly for strings
		String[] s = new String[4];
		// String - null
		System.out.println("default value for string: "+s[2]);
	}
}