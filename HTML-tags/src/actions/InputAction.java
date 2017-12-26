package actions;

import java.util.ArrayList;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import org.apache.struts.actions.*;
import org.apache.struts.util.LabelValueBean;

import forms.InputForm;

public class InputAction extends DispatchAction {
	private static final String SUCCESS = "success";
	
	public ActionForward populate(ActionMapping map, HttpServletRequest request, HttpServletResponse response, ActionForm form) throws Exception{
		InputForm input = (InputForm) form;
		ArrayList country = new ArrayList();
		ArrayList state = new ArrayList();
		
		country.add(new LabelValueBean("1","India"));
		country.add(new LabelValueBean("2","America"));
		country.add(new LabelValueBean("3","Canada"));
		country.add(new LabelValueBean("4","Japan"));
		
		state.add(new LabelValueBean("1","Tamilnadu"));
		state.add(new LabelValueBean("2","Kerala"));
		state.add(new LabelValueBean("3","Andhra Pradesh"));
		state.add(new LabelValueBean("4","Karnataka"));
		
		input.setCountryList(country);
		input.setStateList(state);
		return map.findForward(SUCCESS);
	}
	
	public ActionForward save(ActionMapping map, HttpServletRequest request, HttpServletResponse response, ActionForm form) throws Exception{
		return map.findForward(SUCCESS);
	}
}
