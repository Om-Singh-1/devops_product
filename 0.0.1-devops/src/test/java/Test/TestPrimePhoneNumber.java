package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import com.devops.first.PrimePhoneNumber;

public class TestPrimePhoneNumber {

	
	@Test
	public void check() {
		
		PrimePhoneNumber pn = new PrimePhoneNumber();
		
		assertEquals(false, pn.checkPrime(966512344));
		assertEquals(true, pn.checkPrime(3));
		
	}
	
}
