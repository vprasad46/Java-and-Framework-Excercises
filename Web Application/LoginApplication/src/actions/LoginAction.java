package actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
import org.apache.struts.actions.*;
import org.apache.struts.util.LabelValueBean;

import forms.InputForm;
import forms.LoginForm;
public class LoginAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
		LoginForm t = (LoginForm) form;
		ArrayList list = new ArrayList();
		InputForm ip = new InputForm();
		ip.setId(1);
		ip.setName("Vishwa");
		list.add(ip);
		ip = new InputForm();
		ip.setId(2);
		ip.setName("Krishna");
		list.add(ip);
		t.setList(list);
		return mapping.findForward("success");
	}
}
