package forms;

import org.apache.struts.action.*;

public class CustomForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
