package forms;

import java.util.ArrayList;
import org.apache.struts.action.*;

public class InputForm extends ActionForm {

	private static final long serialVersionUID = -4387855877690115076L;
	private ArrayList countryList;
	private ArrayList stateList;
	private String country;
	private String state;
	
	public ArrayList getCountryList() {
		return countryList;
	}
	public void setCountryList(ArrayList countryList) {
		this.countryList = countryList;
	}
	public ArrayList getStateList() {
		return stateList;
	}
	public void setStateList(ArrayList stateList) {
		this.stateList = stateList;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
