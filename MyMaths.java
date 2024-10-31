// SPDX-FileCopyrightText: 2024 Leonhard Blank leonhardblank@outlook.de
//
// SPDX-License-Identifier: HPND-MIT_disclaimer

public class MyMaths {
	// Method to calculate the greatest common divisor (GCD) of two numbers
	public int gcd(int m, int n) {
		
		int r; // variable for swapping values if necessary
		// Ensure that m >= n by swapping values if needed
		if (n>m) {
			r = m;
			m = n;
			n = r;
		}
		// Calculate remainder of m divided by n
		r = m % n;
		// Continue the process until remainder becomes zero
		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}		
		// When remainder is zero, n is the GCD
		return n;
	}
	
}
