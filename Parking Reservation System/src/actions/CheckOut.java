package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import classes.Basement;
import classes.Floor;

public class CheckOut extends Action {
	private static final String SUCCESS = "success";
	Integer slotNo;
	public ActionForward execute(ActionMapping mapping, ActionForm form,
	        HttpServletRequest request, HttpServletResponse response)
	        throws Exception {
		Floor f = (Floor) request.getSession().getAttribute("floorobj");
		Basement b = (Basement) request.getSession().getAttribute("baseobj");
		DynaActionForm choices = (DynaActionForm)form;
		if(choices.get("choice").equals("Basement")) {
			slotNo = (Integer)choices.get("slotNo"); 
		    b.getSlots().replace(slotNo, "vacant");
		}
		else if(choices.get("choice").equals("Floor")) {
			slotNo = (Integer)choices.get("slotNo"); 
		    f.getSlots().replace(slotNo, "vacant");
		}
		request.getSession().setAttribute("floorobj", f); 
		request.getSession().setAttribute("baseobj", b);
		request.setAttribute("change","true");
		request.setAttribute("fl", f.getSlots().toString());
		request.setAttribute("bs", b.getSlots().toString() );
		return mapping.findForward(SUCCESS);
	}
}
