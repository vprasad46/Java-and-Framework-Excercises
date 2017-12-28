package classes;
import java.util.HashMap;

public class Floor {
	private HashMap slots = new HashMap();
	private int cref = 100, eref = 1, vref = 10, rref = 55;
	private int cst=100,cend=399,est=1,eend=9,vst=10,vend=54,rst=55,rend=99;
	
	public HashMap getSlots() {
		return slots;
	}

	public int getCst() {
		return cst;
	}
	
	public void setCst(int cst) {
		this.cst = cst;
	}

	public int getEst() {
		return est;
	}

	public int getVst() {
		return vst;
	}

	public int getRst() {
		return rst;
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


	public Integer addEmergency() {
		int empty_slot = checkEmptySlots(eref,est-1);
		if( empty_slot != -1) {
			slots.replace(empty_slot, "occupied");
			return empty_slot;
		}
		else if(est<=eend) {
			slots.put(est,"occupied");
			est++;
			return est-1;
		}
		else
			return -1;
	}
	
	public Integer addVIP() {
		int empty_slot = checkEmptySlots(vref,vst-1);
		if( empty_slot != -1) {
			slots.replace(empty_slot, "occupied");
			return empty_slot;
		}
		else if(vst<=vend) {
			slots.put(vst,"occupied");
			vst++;
			return vst-1;
		}
		else
			return -1;
	}
	
	public Integer addReserved() {
		int empty_slot = checkEmptySlots(rref,rst-1);
		if( empty_slot != -1) {
			slots.replace(empty_slot, "occupied");
			return empty_slot;
		}
		else if(rst<=rend) {
			slots.put(rst,"occupied");
			rst++;
			return rst-1;
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
