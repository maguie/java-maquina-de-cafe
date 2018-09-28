/**
 * 
 */

/**
 * @author maria.velasco
 *
 */
public class MaquinaDeCafe {

	protected Coffee cafetera;
	protected Cup vasosPequeno;
	protected Cup vasosMediano;
	protected Cup vasosGrande;
	protected Azucarero azucarero;
	
	
	public Coffee getCafetera() {
		return cafetera;
	}
	public void setCafetera(Coffee cafetera) {
		this.cafetera = cafetera;
	}
	public Cup getVasosPequeno() {
		return vasosPequeno;
	}
	public void setVasosPequeno(Cup vasosPequeno) {
		this.vasosPequeno = vasosPequeno;
	}
	public Cup getVasosMediano() {
		return vasosMediano;
	}
	public void setVasosMediano(Cup vasosMediano) {
		this.vasosMediano = vasosMediano;
	}
	public Cup getVasosGrande() {
		return vasosGrande;
	}
	public void setVasosGrande(Cup vasosGrande) {
		this.vasosGrande = vasosGrande;
	}
	public Azucarero getAzucarero() {
		return azucarero;
	}
	public void setAzucarero(Azucarero azucarero) {
		this.azucarero = azucarero;
	}

	public Cup getTipoDeVaso(String tipo) {

		
		switch (tipo) {
		case "pequeno":
			return this.vasosPequeno;
		case "mediano":
			return this.vasosMediano;
		case "grande":
			return this.vasosGrande;
		default:
			return null;
		}
	}
	
	public String getVasoDeCafe(Cup vaso, int cantidadVasos, int cantidadAzucar) {
		int cantidadCafe = vaso.getSize() * cantidadVasos;
		
		if(!(vaso.getCupQty()>=cantidadVasos)) {
			return "No hay vasos";
		}
		
		if(cantidadCafe > cafetera.getAvailableCups()) {
			return "No hay cafe";
		}
		
		if(!azucarero.hasAzucar(cantidadAzucar)) {
			return "No hay azucar";
		}
		
		//Entregar café
		vaso.giveCups(cantidadVasos);
		this.azucarero.giveAzucar(cantidadAzucar);
		this.cafetera.giveCoffee(cantidadCafe);
		
		return "Felicitaciones!";
	}
	
	
}
