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
		Cup vaso = null;
		
		switch (tipo) {
		case "pequeno":
			vaso = new Cup(3,1);
			break;
		case "mediano":
			vaso = new Cup(5,1);
			break;
		case "grande":
			vaso = new Cup(7,1);
			break;
		default:
			break;
		}
		return vaso;
	}
	
	public String getVasoDeCafe(Cup vaso, int cantidadVasos, int cantidadAzucar) {
		int cantidadCafe = vaso.getSize() * cantidadVasos;
		
		if(!(vaso.getCupQty()>=cantidadVasos)) {
			return "No hay vasos";
		}
		
		if(cantidadCafe < cafetera.getAvailableCups()) {
			return "No hay cafe";
		}
		
		if(!azucarero.hasAzucar(cantidadAzucar)) {
			return "No hay azucar";
		}
		
		//Entregar café
		vaso.giveCups(cantidadVasos);
		azucarero.giveAzucar(cantidadAzucar);
		cafetera.giveCoffee(cantidadCafe);
		
		return "Felicitaciones!";
	}
	
	
}
