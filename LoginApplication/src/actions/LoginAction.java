package actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
import org.apache.struts.actions.*;


import forms.InputForm;
public class LoginAction extends LookupDispatchAction{
	
	@Override
	protected Map getKeyMethodMap() {
		  Map map = new HashMap();
	      map.put("met.pop", "populate");
	      map.put("met.run", "run");
	      return map;
		
	}
	
	public ActionForward populate(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
		InputForm ip = (InputForm) form;
		ip.setCountry("Populate country");
		return mapping.findForward("success");
	}
	public ActionForward run(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
		InputForm ip = (InputForm) form;
		ip.setCountry("Run country");
		return mapping.findForward("success");
	}
	
}
