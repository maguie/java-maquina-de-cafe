import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class TestMaquinaDeCafe {

	Coffee cafetera;
	Cup vasosPequeno;
	Cup vasosMediano;
	Cup vasosGrande;
	Azucarero azuquero;
	MaquinaDeCafe maquinaDeCafe;
	
	@Before
	public void setUp() {
		cafetera = new Coffee(50);
		vasosPequeno = new Cup(5,10);
		vasosMediano = new Cup(5,20);
		vasosGrande = new Cup(5,30);
		azuquero = new Azucarero(20);
		
		maquinaDeCafe = new MaquinaDeCafe();
		maquinaDeCafe.setCafetera(cafetera);
		maquinaDeCafe.setVasosPequeno(vasosPequeno);
		maquinaDeCafe.setVasosMediano(vasosMediano);
		maquinaDeCafe.setVasosGrande(vasosGrande);
		maquinaDeCafe.setAzucarero(azuquero);
	}
	
	@Test
	public void shouldIGiveBackVasoPequeno() {
		Cup vaso = maquinaDeCafe.getTipoDeVaso("pequeno");
		
		assertEquals(3, vaso.getSize());
	}
	
	@Test
	public void shoudIGiveBackVasoMediano() {
		Cup vaso = maquinaDeCafe.getTipoDeVaso("mediano");
		
		assertEquals(5, vaso.getSize());
	}
	
	@Test
	public void shoudIGiveBackVasoGrande() {
		Cup vaso = maquinaDeCafe.getTipoDeVaso("grande");
		
		assertEquals(7, vaso.getSize());
	}

	@Test
	public void shoudISayThereIsNoVasos() {
		Cup vaso = maquinaDeCafe.getTipoDeVaso("pequeno");
		
		String result = maquinaDeCafe.getVasoDeCafe(vaso,10,2);
		
		assertEquals("No hay vasos", result);
	}
	
	@Test
	public void shoudISayThereIsNoCoffee() {
		cafetera = new Coffee(5);
		maquinaDeCafe.setCafetera(cafetera);
		Cup vaso = maquinaDeCafe.getTipoDeVaso("pequeno");
		
		
		String result = maquinaDeCafe.getVasoDeCafe(vaso,1,2);
		
		assertEquals("No hay café", result);
	}
	
	@Test
	public void shoudISayThereIsNoAzucar() {
		azuquero = new Azucarero(2);
		maquinaDeCafe.setAzucarero(azuquero);
		Cup vaso = maquinaDeCafe.getTipoDeVaso("pequeno");
		
		
		String result = maquinaDeCafe.getVasoDeCafe(vaso,1,3);
		
		assertEquals("No hay azucar", result);
	}
	
	@Test
	public void shoudITakeCoffee() {
		
		Cup vaso = maquinaDeCafe.getTipoDeVaso("pequeno");
		maquinaDeCafe.getVasoDeCafe(vaso,1,3);
		
		int result = maquinaDeCafe.getCafetera().getAvailableCups();
		
		assertEquals(40, result);
	}
	
	@Test
	public void shoudITakeCup() {
		
		Cup vaso = maquinaDeCafe.getTipoDeVaso("pequeno");
		maquinaDeCafe.getVasoDeCafe(vaso,1,3);
		
		int result = maquinaDeCafe.getVasosPequeno().getCupQty();
		
		assertEquals(4, result);
	}
	
	@Test
	public void shoudITakeSugar() {
		
		Cup vaso = maquinaDeCafe.getTipoDeVaso("pequeno");
		maquinaDeCafe.getVasoDeCafe(vaso,1,3);
		
		int result = maquinaDeCafe.getAzucarero().getCantidadDeAzucar();
		
		assertEquals(17, result);
	}
}
