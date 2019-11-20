import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsPrime {
	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}
		return true; // number is prime
	}

	@Test
	void test() {
		
		assertTrue(isPrime(3));
		assertFalse(isPrime(6));
		assertTrue(isPrime(11));
	}
	
	@Test
	void testCharAt() {
		String sentence = "Hyperion is Awesome!!!";
				
		assertEquals('H', sentence.charAt(0));
			
	}
	
	@Test
	void testLength() {
		String word1 = "Monday";
		String word2 = "Friday";
				
		assertEquals(word1.length(),word2.length());
			
	}
	
	@Test
	void testIndexOf() {
		String str = "Hyperion is awesome";
		String characterWanted = "r";

			    /*
			    (J) (a) (v) (a) ( ) (i) (s) ( ) (f) (u) (n)
			     0   1   2   3   4   5   6   7   8   9   10
			    Therefore the index of i is 5.
			    */

		Short actual = 4;
		Short expected = (short) str.indexOf(characterWanted);
		assertEquals(expected , actual );
			
	}
	
	@Test
	void tesSubstring() {
		String word1 = "Monday";
		String word2 = "Friday";
				
		equals(word1.substring(3) == "day");
		equals(word2.substring(0, 3) == "Fri");
			
	}

}
