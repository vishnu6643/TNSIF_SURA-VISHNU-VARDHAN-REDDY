package com.tnsif.day02.KeywordsPrimitiveLooping;

public class Keywords {
	public static void main(String[] args) {
		for (int k = 5; k < 15; k++)
		{
		// Odd numbers are skipped
		if (k%2 != 0)
		continue;
		// Even numbers are printed
		System.out.print(k + " ");
		}
	}
}
