package jp.co.junit4.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizBuzzTest {

	@Test
	public void checkFizzBuzzTest() {
		assertEquals("Fizz", FizBuzz.checkFizzBuzz(9));
	}

	@Test
	public void checkFizzBuzzTest2() {
		assertEquals("Buzz", FizBuzz.checkFizzBuzz(20));
	}

	@Test
	public void checkFizzBuzzTest3() {
		assertEquals("FizzBuzz", FizBuzz.checkFizzBuzz(45));
	}

	@Test
	public void checkFizzBuzzTest4() {
		assertEquals("44", FizBuzz.checkFizzBuzz(44));
	}

	@Test
	public void checkFizzBuzzTest5() {
		assertEquals("46", FizBuzz.checkFizzBuzz(46));
	}

}
