package forms;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm{
	private static final long serialVersionUID = 3011799872287841118L;
	private String userName;
	private String password;
	private ArrayList list;
	
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
	public ArrayList getList() {
		return list;
	}
	public void setList(ArrayList list) {
		this.list = list;
	}
}
