

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVaso {
	
	@Test
	public void hasCups() {
		Cup vaso = new Cup(2,10);
		boolean result = vaso.hasCups(2);
		assertEquals(true,result);
	}
	
	@Test
	public void doesntHaveCups() {
		Cup vaso = new Cup(2,0);
		boolean result = vaso.hasCups(2);
		assertEquals(false,result);
	}
	
	@Test
	public void substractCups() {
		Cup vaso = new Cup(5,10);
		vaso.giveCups(3);
		Integer cups = 7;
		assertEquals(cups,vaso.getCupQty());
	}

}
