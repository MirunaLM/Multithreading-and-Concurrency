package Method1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPrimeNumbers {

	@Test
	void getMinMax() {
		int n = 20;
		int k = 5;
		
		Intervals interval = new Intervals(n, k);
		for(int i = 1; i < k; i++) {
		assertTrue(interval.getIntervals().containsKey((i - 1) * (n / k) + (n % k) + 1));
		assertTrue(interval.getIntervals().containsValue( i * (n / k) + (n % k)));
		}
	}

}
