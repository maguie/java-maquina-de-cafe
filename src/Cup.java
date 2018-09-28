
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Cup {
	private int size;
	Map<Integer,Integer> availableCups = new HashMap<>();

	public Cup(int size, int quantity) {
		super();
		this.size = size;
		this.availableCups.put(size, quantity);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean hasCups(int size) {
		if(this.availableCups.get(size)>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void giveCups(int quantity) {
		int actual = this.availableCups.get(this.size) - quantity;
		if(actual<0) {
			System.out.println("Not enough cups available. Current available cups: "+this.getCupQty());
		}else {
			this.availableCups.put(this.size, actual);
		}	
	}
	
	public Integer getCupQty() {
		return this.availableCups.get(size);
	}
}
