package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import classes.Basement;
import classes.Floor;

public class BookTicket extends DispatchAction{
	int alloted_slot,fcustomer_slot,bcustomer_slot;
	private static final String SUCCESS = "success";
	public ActionForward Customer(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Floor f = (Floor) request.getSession().getAttribute("floorobj");
		Basement b = (Basement) request.getSession().getAttribute("baseobj");
		fcustomer_slot = f.addCustomer();
		bcustomer_slot = b.addCustomer();
		request.setAttribute("slotNo",parkCustomer(fcustomer_slot,bcustomer_slot,f,b));
		request.getSession().setAttribute("floorobj", f); 
		request.getSession().setAttribute("baseobj", b);
		return mapping.findForward(SUCCESS);
	}
	
	public ActionForward Emergency(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Floor f = (Floor) request.getSession().getAttribute("floorobj");
		alloted_slot = f.addEmergency();
		 if(alloted_slot != -1)
			 request.setAttribute("slotNo",alloted_slot);
		 else 
			 request.setAttribute("slotNo",0);
		 
		request.getSession().setAttribute("floorobj", f); 
		return mapping.findForward(SUCCESS);
	}
	
	public ActionForward VIP(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Floor f = (Floor) request.getSession().getAttribute("floorobj");
		alloted_slot = f.addVIP();
		 if(alloted_slot != -1)
			 request.setAttribute("slotNo",alloted_slot);
		 else 
			 this.Customer(mapping,form,request,response);
		 
		request.getSession().setAttribute("floorobj", f); 
		return mapping.findForward(SUCCESS);
	}
	
	public ActionForward Reserved(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Floor f = (Floor) request.getSession().getAttribute("floorobj");
		alloted_slot = f.addReserved();
		 if(alloted_slot != -1)
			 request.setAttribute("slotNo",alloted_slot);
		 else 
			 request.setAttribute("slotNo",0);
		 
		request.getSession().setAttribute("floorobj", f); 
		return mapping.findForward(SUCCESS);
	}
	
	public ActionForward ShopOwner(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Basement b = (Basement) request.getSession().getAttribute("baseobj");
		alloted_slot = b.addSales();
		 if(alloted_slot != -1)
			 request.setAttribute("slotNo",alloted_slot);
		 else 
			 request.setAttribute("slotNo",0);
		request.getSession().setAttribute("baseobj", b);
		return mapping.findForward(SUCCESS);
	}
	
	public static Integer parkCustomer(int fcustomer_slot, int bcustomer_slot, Floor f, Basement b) {
		if((fcustomer_slot!= -1) && (fcustomer_slot <= bcustomer_slot)) {
			if(fcustomer_slot == f.getCst()) {
				f.getSlots().put(fcustomer_slot, "occupied");
				f.setCst(fcustomer_slot+1);
			}
			else {
				f.getSlots().replace(fcustomer_slot, "occupied");
			}
			return fcustomer_slot;
		}
		else if((bcustomer_slot!= -1) && (fcustomer_slot > bcustomer_slot)) {
			if(bcustomer_slot == b.getCst()) {
				b.getSlots().put(bcustomer_slot, "occupied");
				b.setCst(bcustomer_slot+1);
			}
			else {
				b.getSlots().replace(bcustomer_slot, "occupied");
			}
			return -bcustomer_slot;
		}
		else {
			 if(fcustomer_slot != -1 && bcustomer_slot == -1) {
				 if(fcustomer_slot == f.getCst()) {
						f.getSlots().put(fcustomer_slot, "occupied");
						f.setCst(fcustomer_slot+1);
					}
				else {
					f.getSlots().replace(fcustomer_slot, "occupied");
				}
				return fcustomer_slot;
			 }
			 else if(bcustomer_slot != -1 && fcustomer_slot == -1) {
				 if(bcustomer_slot == b.getCst()) {
						b.getSlots().put(bcustomer_slot, "occupied");
						b.setCst(bcustomer_slot+1);
					}
				else {
					b.getSlots().replace(bcustomer_slot, "occupied");
				}
				return -bcustomer_slot;
			 }
			 else {	 
				return 0;
			 }
		 }
	}
}
