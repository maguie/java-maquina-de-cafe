/**
 * 
 */

/**
 * @author maria.velasco
 *
 */
public class Azucarero {

	protected int cantidadDeAzucar;
	protected int totalAzucar;

	public Azucarero(int i) {
		// TODO Auto-generated constructor stub
		this.totalAzucar = i;
		this.cantidadDeAzucar = 0;
	}
	
	public int getTotalAzucar() {
		return totalAzucar;
	}

	public void setTotalAzucar(int totalAzucar) {
		this.totalAzucar = totalAzucar;
	}	

	public int getCantidadDeAzucar() {
		return cantidadDeAzucar;
	}

	public void setCantidadDeAzucar(int cantidadDeAzucar) {
		this.cantidadDeAzucar = cantidadDeAzucar;
	}
	
	public boolean hasAzucar(int amount) {
		boolean result = false;
		if ( (this.totalAzucar - amount) >= 0 ) {
			result = true;
		}
		return result;
	}
	
	public void giveAzucar(int amount) {
		 if(this.totalAzucar >= amount) {
			 setCantidadDeAzucar(amount);
			 this.totalAzucar -= amount;
		 }
	}
	
}
