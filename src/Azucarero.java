/**
 * 
 */

/**
 * @author maria.velasco
 *
 */
public class Azucarero {

	protected int cantidadDeAzucar;
	//protected int totalAzucar;

	public Azucarero(int i) {
		// TODO Auto-generated constructor stub
		//this.totalAzucar = i;
		this.cantidadDeAzucar = i;
	}

	public int getCantidadDeAzucar() {
		return cantidadDeAzucar;
	}

	public void setCantidadDeAzucar(int cantidadDeAzucar) {
		this.cantidadDeAzucar = cantidadDeAzucar;
	}
	
	public boolean hasAzucar(int amount) {
		boolean result = false;
		if ( (this.cantidadDeAzucar - amount) >= 0 ) {
			result = true;
		}
		return result;
	}
	
	public void giveAzucar(int amount) {
		 this.cantidadDeAzucar -= amount;
	}
	
}
