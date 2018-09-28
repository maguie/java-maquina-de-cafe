import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class TestAzucarero {

	Azucarero azuquero;
	
	@Before
	public void setUp() {
		this.azuquero = new Azucarero(10);
	}
	
	@Test
	public void trueIfHasSugarInAzucarero() {
		boolean result = azuquero.hasAzucar(5);
		
		assertEquals(true, result);
		
	}

	@Test
	public void falseIfHasNotSugarInAzucarero() {
		boolean result = azuquero.hasAzucar(15);
		
		assertEquals(false, result);
		
	}
	
	@Test
	public void shouldIGetSugarfromAzucarero() {
		azuquero.giveAzucar(5);
		
		assertEquals(5, azuquero.getCantidadDeAzucar());
		
		//azuquero.giveAzucar(3);
		
		//assertEquals(5, azuquero.getCantidadDeAzucar());
		
	}
}
