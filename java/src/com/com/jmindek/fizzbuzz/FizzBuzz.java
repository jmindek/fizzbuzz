package com.jmindek.fizzbuzz;

public class FizzBuzz {
	private int size;

	public FizzBuzz(int s) {
		size = s;
	}

	public int size() {
		return size;
	}

	public String compute(int n) {
		if (mod3(n)) {
			return "Fizz";
		} else if (mod5(n)) {
			return "Buzz";
		} else if (mod3and5(n)) {
			return "FizzBuzz";
		} else {
			return "" + n + "";
		}
	}

	private boolean mod3(int n) {
		return ((n % 3) == 0 && !mod3and5(n));
	}

	private boolean mod3and5(int n) {
		return ((n % 3) + (n % 5) == 0);
	}

	private boolean mod5(int n) {
		return ((n % 5) == 0 && !mod3and5(n));
	}
	
	public static void main(String[] args){
		FizzBuzz fb = new FizzBuzz(100);
		for (int n=1;n<=fb.size();n++){
			System.out.print(fb.compute(n) + ' ');
		}
	}
}
