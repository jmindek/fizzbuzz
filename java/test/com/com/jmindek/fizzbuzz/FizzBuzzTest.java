package com.jmindek.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	public FizzBuzz fb;

	@Before
	public void setUp() {
		fb = new FizzBuzz(100);
	}

	@Test
	public void processAllNumbersGiven() {
		assertTrue(fb.size() == 100);
	}

	@Test
	public void replaceNumWithFizzwhenMod3() {
		assertEquals("Fizz", fb.compute(3));
		assertEquals("Fizz", fb.compute(9));
	}
	
	@Test
	public void replaceNumWithFizzwhenMod5() {
		assertEquals("Buzz", fb.compute(5));
		assertEquals("Buzz", fb.compute(10));
	}
	
	@Test
	public void replaceNumWithFizzwhenMod3and5() {
		assertEquals("FizzBuzz", fb.compute(15));
		assertEquals("FizzBuzz", fb.compute(30));
	}
	
	@Test 
	public void returnNumWhenOtherwise() {
		assertEquals("16", fb.compute(16));
	}

}

