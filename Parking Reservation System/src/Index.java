import java.util.*;

public class Index {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Basement b = new Basement();
		Floor f = new Floor();
		int ch,c = 0;
		
		System.out.println("--------------------------------");
		System.out.println(":: Parking Reservation System ::");
		System.out.println("--------------------------------");
		while(c == 0) {
			System.out.println(":: 1.Book Parking 2.Checkout 3.Floor Slots 4.Basement Slots 5.Exit ::");
			ch= input.nextInt();
			switch(ch) {
				case 1: checkIn(f,b,input); break;
				case 2: checkOut(f,b,input); break;
				case 3: System.out.println(f.getSlots().toString()); break;
				case 4: System.out.println(b.getSlots().toString()); break;
				default:
					c=1;
					System.out.println("--------------------------------");
					System.out.println(":: Thank you. Have a nice day! ::");
					System.out.println("--------------------------------");
			}
		}
	}
	
	public static void checkIn(Floor f, Basement b, Scanner input) {
		System.out.println("-----------------------------------------------------------");
		System.out.println(":: 1.Customer 2.Emergency 3.VIP 4.Reserved 5. Shop Owner ::");
		System.out.println("-----------------------------------------------------------");
		int ch = input.nextInt();
		int alloted_slot,fcustomer_slot,bcustomer_slot;
		switch(ch) {
			case 1 : 
					fcustomer_slot = f.addCustomer();
					bcustomer_slot = b.addCustomer();
					// To decide between basement and floor
					parkCustomer(fcustomer_slot,bcustomer_slot,f,b);
					break;
			case 2 : 
					 alloted_slot = f.addEmergency();
					 if(alloted_slot != -1)
						System.out.println("Parking slot number is F"+ alloted_slot);
					 else {
						 System.out.println("Parking Full.");
					 }
					 	break;  
			case 3 : 
					 alloted_slot = f.addVIP();
					 if(alloted_slot != -1)
						System.out.println("Parking slot number is F"+ alloted_slot);
					 else {
						 System.out.println("Parking Full.");
					 }
					 	break;  
			case 4 : 
					 alloted_slot = f.addReserved();
					 if(alloted_slot != -1)
						System.out.println("Parking slot number is F"+ alloted_slot);
					 else {
						 System.out.println("Parking Full.");
					 }
					 	break; 
			case 5 : 
					 alloted_slot = b.addSales();
					 if(alloted_slot != -1)
						System.out.println("Parking slot number is B"+ alloted_slot);
					 else {
						 System.out.println("Parking Full.");
					 }
					 	break;
			}	
	  }
	
	public static void checkOut(Floor f, Basement b, Scanner input) {
		System.out.println("--------------------------------");
		System.out.println(":: 1. Basement 2.Floor 3.Exit ::");
		System.out.println("--------------------------------");
		int ch = input.nextInt();
		int slotno;
		switch(ch) {
			case 1: System.out.println(":: Enter the slot number ::");
				    slotno = input.nextInt();
				    b.getSlots().replace(slotno, "deactivated");
					System.out.println(b.getSlots().toString());
					break;
			case 2: System.out.println(":: Enter the slot number ::");
					slotno = input.nextInt();
					f.getSlots().replace(slotno, "deactivated");
					System.out.println(f.getSlots().toString());
					break;
		}
	}
	
	public static void parkCustomer(int fcustomer_slot, int bcustomer_slot, Floor f, Basement b) {
		if((fcustomer_slot!= -1) && (fcustomer_slot <= bcustomer_slot)) {
			if(fcustomer_slot == f.getCst()) {
				f.getSlots().put(fcustomer_slot, "activated");
				f.setCst(fcustomer_slot+1);
			}
			else {
				f.getSlots().replace(fcustomer_slot, "activated");
			}
			System.out.println("Parking slot number is F"+ fcustomer_slot);
		}
		else if((bcustomer_slot!= -1) && (fcustomer_slot > bcustomer_slot)) {
			if(bcustomer_slot == b.getCst()) {
				b.getSlots().put(bcustomer_slot, "activated");
				b.setCst(bcustomer_slot+1);
			}
			else {
				b.getSlots().replace(bcustomer_slot, "activated");
			}
			System.out.println("Parking slot number is B"+ bcustomer_slot);
		}
		else {
			 if(fcustomer_slot != -1 && bcustomer_slot == -1) {
				 if(fcustomer_slot == f.getCst()) {
						f.getSlots().put(fcustomer_slot, "activated");
						f.setCst(fcustomer_slot+1);
					}
				else {
					f.getSlots().replace(fcustomer_slot, "activated");
				}
				System.out.println("Parking slot number is F"+ fcustomer_slot);
			 }
			 else if(bcustomer_slot != -1 && fcustomer_slot == -1) {
				 if(bcustomer_slot == b.getCst()) {
						b.getSlots().put(bcustomer_slot, "activated");
						b.setCst(bcustomer_slot+1);
					}
				else {
					b.getSlots().replace(bcustomer_slot, "activated");
				}
				System.out.println("Parking slot number is B"+ bcustomer_slot);
			 }
			 else {	 
				 System.out.println("Parking Full.");
			 }
		 }
	}
}
