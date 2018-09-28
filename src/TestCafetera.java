
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class TestCafetera {

	public Coffee cafe;
	
	@Before
	public void setUp() {
		cafe = new Coffee(10);
	}
	
	@Test
	public void hasCoffee() {
		boolean result = cafe.hasCoffee(10);
		assertEquals(true,result);
	}
	
	@Test
	public void doesntHaveCoffee() {
		boolean result = cafe.hasCoffee(101);
		assertEquals(false,result);
	}
	
	@Test
	public void substractCups() {
		cafe.giveCoffee(7);
		assertEquals(3,cafe.getAvailableCups());
	}

}
