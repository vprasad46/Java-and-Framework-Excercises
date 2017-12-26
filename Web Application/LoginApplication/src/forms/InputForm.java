package forms;

import org.apache.struts.action.*;

public class InputForm extends ActionForm {

	private static final long serialVersionUID = -4387855877690115076L;
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
