package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;

public class LoginForm extends ActionForm{
	private static final long serialVersionUID = 3011799872287841118L;
	private String userName;
	private String password;
	
	public LoginForm() {
		super();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if(userName == null || userName.length()<1)
			errors.add("userName", new ActionMessage("error.userName.required"));
		if(password == null || password.length()<1)
			errors.add("password", new ActionMessage("error.password.required"));
		
		return errors;
	}
}
