package jp.co.junit4.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizBuzzTest {

	@Test
	public void checkFizzBuzzTest() {
		assertEquals("Fizz", FizBuzz.checkFizzBuzz(3));
	}

	@Test
	public void checkFizzBuzzTest2() {
		assertEquals("Buzz", FizBuzz.checkFizzBuzz(5));
	}

	@Test
	public void checkFizzBuzzTest3() {
		assertEquals("FizzBuzz", FizBuzz.checkFizzBuzz(15));
	}

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void test() {
//		fail("まだ実装されていません");
//	}

}
