package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.Primes;


public class PrimesTest {

	@Test
	public void testCountPrimes1() {
		int n = 1;
		int expected = 0;
		assertEquals(expected, Primes.countPrimes(n));
	}
	
	@Test
	public void testCountPrimes2() {
		int n = 2;
		int expected = 0;
		assertEquals(expected, Primes.countPrimes(n));
	}
	
	@Test
	public void testCountPrimes3() {
		int n = 7;
		int expected = 3;
		assertEquals(expected, Primes.countPrimes(n));
	}
	
	@Test
	public void testCountPrimes4() {
		int n = 49979;
		int expected = 5130;
		assertEquals(expected, Primes.countPrimes(n));
	}

	@Test
	public void testCountPrimes5() {
		int n = 999983;
		int expected = 78497;
		assertEquals(expected, Primes.countPrimes(n));
	}
}
