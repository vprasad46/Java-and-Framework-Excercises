package classes;
import java.util.HashMap;

public class Basement {
	private HashMap slots = new HashMap();
	private int cref=100,sref=400;
	private int cst=100,cend=399,sst=400,send=699;
	
	public int getCst() {
		return cst;
	}
	
	public void setCst(int cst) {
		this.cst = cst;
	}
	
	public int getSst() {
		return sst;
	}
	
	public HashMap getSlots() {
		return slots;
	}
	
	public Integer addCustomer() {
		int empty_slot = checkEmptySlots(cref,cst-1);
		if( empty_slot != -1) {
			return empty_slot;
		}
		else if(cst<=cend) {
			return cst;
		}
		else
			return -1;
	}
	
	public Integer addSales() {
		int empty_slot = checkEmptySlots(cref,cst-1);
		if( empty_slot != -1) {
			slots.replace(empty_slot, "occupied");
			return empty_slot;
		}
		else if(sst<=send) {
			slots.put(sst,"occupied");
			sst++;
			return sst-1;
		}
		else
			return -1;
	}
	
	private Integer checkEmptySlots(int st, int end){
		for(int i=st;i<=end;i++) {
			if(this.slots.get(i).equals("vacant"))
				return i;
		}
		return -1;
	}
}