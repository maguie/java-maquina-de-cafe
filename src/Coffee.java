

public class Coffee {
	private int coffeeCups;

	public int getCoffeeCups() {
		return coffeeCups;
	}

	public void setCoffeeCups(int coffeeCups) {
		this.coffeeCups = coffeeCups;
	}

	public Coffee(int coffeeCups) {
		super();
		this.coffeeCups = coffeeCups;
	}
	
	public boolean hasCoffee(int cups) {
		if(cups<=this.coffeeCups) {
			return true;
		}else {
			return false;
		}
	}
	
	public void giveCoffee(int quantity) {
		int actual = this.coffeeCups - quantity;
		if(actual<0) {
			System.out.println("Not enough cups available. Current available cups: "+this.getAvailableCups());
		}else {
			setCoffeeCups(actual);
		}
	}
	
	public int getAvailableCups() {
		return getCoffeeCups();
	}
}
