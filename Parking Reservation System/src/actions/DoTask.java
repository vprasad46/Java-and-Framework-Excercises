package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
import org.apache.struts.actions.*;

import classes.Basement;
import classes.Floor;

public class DoTask extends DispatchAction{
	private static final String BOOKTICKET = "bookticket";
	private static final String CHECKOUT = "checkout";
	private static final String FLOOR = "floor";
	private static final String BASEMENT = "basement";
	public ActionForward BookTicket(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Floor f = (Floor) request.getSession().getAttribute("floorobj");
		Basement b = (Basement) request.getSession().getAttribute("baseobj");
		
		if(f == null) request.getSession().setAttribute("floorobj", new Floor()); 
		if(b == null) request.getSession().setAttribute("baseobj", new Basement());
        return mapping.findForward(BOOKTICKET);
    }
	
	public ActionForward Checkout(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return mapping.findForward(CHECKOUT);
    }
	
	public ActionForward Floor(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Floor f = (Floor) request.getSession().getAttribute("floorobj");
		if(f == null)
			request.setAttribute("fl", null);
		else
			request.setAttribute("fl", f.getSlots().toString());
		request.setAttribute("change","true");	
        return mapping.findForward(FLOOR);
    }
	
	public ActionForward Basement(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Basement b = (Basement) request.getSession().getAttribute("baseobj");
		if(b == null)
			request.setAttribute("bs", null);
		else
			request.setAttribute("bs", b.getSlots().toString());
		request.setAttribute("change","true");	
        return mapping.findForward(BASEMENT);
    }

}
